package com.dywl.example.service;

import com.dywl.example.model.entity.UserEntity;
import com.dywl.example.model.vo.LoginVo;

/**
 * TODO Add desc
 *
 * @author Harry
 * @email dishpzga@163.com
 * @date 2020/8/13
 */
public interface IUserService {
    UserEntity getDetail(String userName);

    LoginVo login(String userName, String password);

    boolean update(UserEntity entity);

    boolean insert(UserEntity entity);

    boolean delete(Long userId);
}
