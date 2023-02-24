package com.app.api.web.appapi.model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {

  public List<CategoryDTO> categoryDTOList = new ArrayList<>();

  public void addAuthor(CategoryDTO categoryDTO) {
    this.categoryDTOList.add(categoryDTO);
  }


}

