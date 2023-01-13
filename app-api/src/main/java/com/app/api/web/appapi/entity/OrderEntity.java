package com.app.api.web.appapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_order")
@Entity
@Data
public class OrderEntity  extends BaseEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "order_id", nullable = false)
  private Long orderId;

  @Column(name = "order_code", nullable = false)
  private String orderCode;

  @Column(name = "total_price", nullable = false)
  private String totalPrice;

  @Column(name = "user_id", nullable = false)
  private Long userId;

  @Column(name = "customer_id")
  private Long customerId;

}
