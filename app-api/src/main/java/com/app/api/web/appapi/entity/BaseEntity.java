package com.app.api.web.appapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import java.util.Date;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NaturalIdCache;

@NaturalIdCache
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
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
