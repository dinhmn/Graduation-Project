package com.app.api.web.appapi.model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CategoryDTO {

  private Long categoryId;
  private String categoryName;
  private String seo;
  private String description;
  private List<ProductDTO> productDTOList = new ArrayList<>();

}
