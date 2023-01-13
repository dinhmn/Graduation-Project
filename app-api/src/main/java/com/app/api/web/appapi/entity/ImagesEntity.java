package com.app.api.web.appapi.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_images")
@Entity
@Data
public class ImagesEntity  extends BaseEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "image_id", nullable = false)
  private Long imageId;

  @Column(name = "file_name", nullable = false)
  private String fileName;

  @Column(name = "file_type", nullable = false)
  private String fileType;

  @Lob
  @Basic(fetch = FetchType.LAZY, optional = true)
  @Column(name = "data", nullable = false)
  private byte[] data;

  @Column(name = "hidden")
  private Boolean hidden = Boolean.FALSE;

  @Column(name = "product_id", nullable = false)
  private Long productId;


}
