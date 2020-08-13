package com.dywl.example.model.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * TODO Add desc
 *
 * @author Harry
 * @email dishpzga@163.com
 * @date 2020/8/13
 */
@Data
@Entity
@Table(name = "biz_demo_user")
public class UserEntity extends BaseEntity {
    private String userName;
    private String password;
    private Integer age;
}
