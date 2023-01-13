package com.app.api.web.appapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_order_product")
@Entity
@Data
public class OrderProductEntity extends BaseEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "order_product_id", nullable = false)
  private Long orderProductId;

  @Column(name = "quantity", nullable = false)
  private Long quantity;

  @Column(name = "price", nullable = false)
  private BigDecimal price;

  @Column(name = "order_id", nullable = false)
  private Long order;

  @Column(name = "product_id", nullable = false)
  private Long productId;

}
