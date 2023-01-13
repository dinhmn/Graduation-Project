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
@Table(name = "tbl_users")
@Entity
@Data
public class UsersEntity extends BaseEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id", nullable = false)
  private Long userId;

  @Column(name = "user_name", nullable = false)
  private String userName;

  @Column(name = "password", nullable = false)
  private String password;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private Long lastName;

  @Column(name = "phone", length = 30, nullable = false)
  private String phone;

  @Column(name = "email", length = 50, nullable = false)
  private String email;

  @Column(name = "address", nullable = false)
  private String address;

  @Column(name = "role_id", nullable = false)
  private Long roleId;

}
