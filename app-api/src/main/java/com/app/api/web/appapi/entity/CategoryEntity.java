package com.app.api.web.appapi.entity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_category")
@Entity
@Data
public class CategoryEntity extends BaseEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "category_id", nullable = false)
  private Long categoryId;

  @Column(name = "category_name", nullable = false)
  private String categoryName;

  @Column(name = "description")
  private String description;

  @Column(name = "seo")
  private String seo;

  @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
  @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
  @ToString.Exclude // Khoonhg sử dụng trong toString()
  private List<ProductEntity> productList;
}
