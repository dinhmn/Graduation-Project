package com.app.api.web.appapi.restController;

import com.app.api.web.appapi.entity.CategoryEntity;
import com.app.api.web.appapi.service.CategoryService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import java.util.List;
import com.app.api.web.appapi.model.CategoryDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

  @Autowired
  CategoryService service;

  @GetMapping("/category")
  public List<CategoryDTO> test() {
    List<CategoryDTO> categoryDTOList = service.getAll();

    return categoryDTOList;
  }

  @GetMapping("/category/search")
  public List<CategoryDTO> getById(@RequestParam("category_id") String categoryId) throws JsonProcessingException {
//    ObjectMapper objectMapper = new ObjectMapper();
//    Form formD = objectMapper.readValue(form, Form.class);
//    System.out.println(formD.description);
//    JSONObject jsonstring = new JSONObject(categoryId);
//
//    Long id = Long.parseLong((String) jsonstring.get("categoryId"));

    List<CategoryDTO> categoryEntityList = service.getByCategoryId(Long.parseLong(categoryId));

    return categoryEntityList;
  }

  @EqualsAndHashCode(callSuper = false)
  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  public class Form{
    private String categoryId;
    private String categoryName;
    private String description;
  }
}
