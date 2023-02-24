package com.app.api.web.appapi.controller;

import com.app.api.web.appapi.model.AuthorDTO;
import com.app.api.web.appapi.model.CategoryDTO;
import com.app.api.web.appapi.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ThymeleafControoler {

  @Autowired
  CategoryService service;

  @GetMapping("/index")
  public String index() {
    return "Hello";
  }

//  @GetMapping("/category/search")
//  public String getById(@RequestParam("category_id") String categoryId) {
//    List<CategoryDTO> categoryDTOList = service.getByCategoryId(Long.parseLong(categoryId));
//
//
//    return "redirect:/index";
//  }
  @GetMapping("/check")
  public String check(Model model) {
    AuthorDTO authorDTO = new AuthorDTO();
    List<CategoryDTO> categoryDTOList = service.getAll();

    categoryDTOList.iterator().forEachRemaining(author -> authorDTO.addAuthor(author));
    System.out.println(categoryDTOList.size());
    model.addAttribute("categoryDTOList", categoryDTOList);
    model.addAttribute("form", authorDTO);
    return "Check";
  }

  @PostMapping("/check")
  public String update(Model model, @ModelAttribute AuthorDTO authorDTO) {

    System.out.println(authorDTO.categoryDTOList.size());
    System.out.println(authorDTO.categoryDTOList);
    System.out.println(authorDTO.categoryDTOList.get(0).getCategoryName());
    System.out.println(authorDTO.categoryDTOList.get(0).getCategoryId());
    return "redirect:/check";
  }
}
