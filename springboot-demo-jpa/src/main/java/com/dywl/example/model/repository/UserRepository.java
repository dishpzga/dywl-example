package com.dywl.example.model.repository;

import com.dywl.example.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * TODO Add desc
 *
 * @author Harry
 * @email dishpzga@163.com
 * @date 2020/8/13
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
