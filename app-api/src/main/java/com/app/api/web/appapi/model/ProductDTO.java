package com.app.api.web.appapi.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {

  private Long productId;
  private String productName;
  private Long quantity;
  private String title;
  private String description;
  private BigDecimal price;
  private BigDecimal priceSale;
  private String seo;
}
