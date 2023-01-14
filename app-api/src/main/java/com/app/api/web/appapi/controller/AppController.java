package com.app.api.web.appapi.controller;

import com.app.api.web.appapi.service.CategoryService;
import java.util.List;
import com.app.api.web.appapi.model.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

  @Autowired
  CategoryService service;

  @GetMapping("/")
  public List<CategoryDTO> test() {
    List<CategoryDTO> categoryDTOList = service.getAll();

    return categoryDTOList;
  }
}
