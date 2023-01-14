package com.app.api.web.appapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_product")
@Entity
@Data
public class ProductEntity extends BaseEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_id", nullable = false)
  private Long productId;

  @Column(name = "product_name", nullable = false)
  private String productName;

  @Column(name = "quantity", nullable = false)
  private Long quantity;

  @Column(name = "title", length = 30)
  private String title;

  @Column(name = "product_description")
  private String description;

  @Column(name = "price", nullable = false)
  private BigDecimal price;

  @Column(name = "price_sale")
  private BigDecimal priceSale;

  @Column(name = "seo")
  private String seo;

  @Column(name = "category_id", nullable = false)
  private Long categoryId;
}
