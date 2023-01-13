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
@Table(name = "tbl_delivery")
@Entity
@Data
public class DeliveryEntity extends BaseEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "delivery_id", nullable = false)
  private Long deliveryId;

  @Column(name = "service", nullable = false)
  private String service;

  @Column(name = "order_id", nullable = false)
  private Long orderId;
}
