package com.app.api.web.appapi.repository;

import com.app.api.web.appapi.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<CategoryEntity, Long> {
}
