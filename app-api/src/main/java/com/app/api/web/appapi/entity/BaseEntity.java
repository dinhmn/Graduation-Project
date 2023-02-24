package com.app.api.web.appapi.entity;

import jakarta.persistence.Column;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity {

  @Column(name = "status", nullable = true)
  private Boolean status = Boolean.TRUE;

  @Column(name = "created_by", nullable = false)
  private Integer createdBy;

  @Column(name = "updated_by", nullable = true)
  private Integer updatedBy;

  @Column(name = "created_date", nullable = false)
  private Date createdDate;

  @Column(name = "updated_date", nullable = true)
  private Date updatedDate;
}
