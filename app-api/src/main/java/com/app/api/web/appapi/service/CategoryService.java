package com.app.api.web.appapi.service;

import com.app.api.web.appapi.entity.CategoryEntity;
import com.app.api.web.appapi.entity.ProductEntity;
import com.app.api.web.appapi.model.ProductDTO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.app.api.web.appapi.model.CategoryDTO;
import com.app.api.web.appapi.repository.CategoryRepository;
import com.app.api.web.appapi.repository.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implement category service.
 *
 * @author mai.ngoc.dinh
 */
@Service
public class CategoryService {

  @Autowired
  CategoryRepository categoryRepository;
  @Autowired
  ProductRepository productRepository;

  public List<CategoryDTO> getAll() {
    List<CategoryDTO> categoryDTOList = new ArrayList<>();
    List<CategoryEntity> categoryEntityList = categoryRepository.findAll();
    for (CategoryEntity category : categoryEntityList) {
      categoryDTOList.add(
          toCategory(category, productRepository.findAllByCategoryId(category.getCategoryId())));
    }
    return categoryDTOList;
  }

  public List<CategoryDTO> getByCategoryId(Long categoryId) {
    List<CategoryDTO> categoryDTOList = new ArrayList<>();
    List<CategoryEntity> categoryEntityList = categoryRepository.findAllById(
        Collections.singleton(categoryId));
    for (CategoryEntity category : categoryEntityList) {
      categoryDTOList.add(
          toCategory(category, productRepository.findAllByCategoryId(category.getCategoryId())));
    }
    return categoryDTOList;
  }

  private CategoryDTO toCategory(CategoryEntity entity, List<ProductEntity> productEntityList) {
    CategoryDTO categoryDTO = new CategoryDTO();
    BeanUtils.copyProperties(entity, categoryDTO);
    categoryDTO.setProductDTOList(productEntityList.stream().map(this::toProduct).toList());
    return categoryDTO;
  }

  private ProductDTO toProduct(ProductEntity entity) {
    ProductDTO productDTO = new ProductDTO();
    BeanUtils.copyProperties(entity, productDTO);
    return productDTO;
  }
}
