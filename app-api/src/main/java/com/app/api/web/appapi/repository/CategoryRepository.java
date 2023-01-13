package com.app.api.web.appapi.repository;

import java.util.List;
import com.app.api.web.appapi.entity.CategoryEntity;
import com.app.api.web.appapi.model.CategoryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

//  @Query(value = " FROM CategoryEntity category"
//      + " LEFT JOIN ProductEntity product ON category.categoryId = product.categoryId")
//  List<CategoryDTO> findAllCategory();
}
