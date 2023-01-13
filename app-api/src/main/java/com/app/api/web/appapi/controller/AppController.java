package com.app.api.web.appapi.controller;

import com.app.api.web.appapi.entity.CategoryEntity;
import java.util.List;
import com.app.api.web.appapi.model.CategoryDTO;
import com.app.api.web.appapi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

  @Autowired
  CategoryRepository categoryRepository;

  @GetMapping("/")
  public String test() {
    List<CategoryEntity> categoryDTOList = categoryRepository.findAll();

    return String.valueOf(categoryDTOList);
  }
}
