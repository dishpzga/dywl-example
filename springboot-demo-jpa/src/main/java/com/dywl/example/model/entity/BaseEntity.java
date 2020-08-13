package com.dywl.example.model.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * TODO Add desc
 *
 * @author Harry
 * @email dishpzga@163.com
 * @date 2020/8/13
 */
@Data
@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;
}
