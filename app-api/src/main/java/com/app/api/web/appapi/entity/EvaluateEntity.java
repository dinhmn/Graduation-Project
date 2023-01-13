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
@Table(name = "tbl_evaluate")
@Entity
@Data
public class EvaluateEntity  extends BaseEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "evaluate_id", nullable = false)
  private Long evaluateId;

  @Column(name = "comment", nullable = false)
  private String comment;

  @Column(name = "rate")
  private String rate;

  @Column(name = "produce_id")
  private Long productId;
}
