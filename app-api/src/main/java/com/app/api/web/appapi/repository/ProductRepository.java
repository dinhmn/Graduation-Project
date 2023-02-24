package com.app.api.web.appapi.repository;

import com.app.api.web.appapi.model.ProductDTO;
import java.util.List;
import com.app.api.web.appapi.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

  @Query(value = "FROM ProductEntity product "
      + " JOIN CategoryEntity category ON product.categoryId = category.categoryId "
      + " WHERE product.categoryId = ?1")
  List<ProductEntity> findAllByCategoryId(Long categoryId);
}
