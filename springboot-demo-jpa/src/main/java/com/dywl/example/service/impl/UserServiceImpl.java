package com.dywl.example.service.impl;

import com.dywl.example.model.entity.UserEntity;
import com.dywl.example.model.vo.LoginVo;
import com.dywl.example.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * TODO Add desc
 *
 * @author Harry
 * @email dishpzga@163.com
 * @date 2020/8/13
 */
@Service
public class UserServiceImpl implements IUserService {
    @Override
    public UserEntity getDetail(String userName) {
        return null;
    }

    @Override
    public LoginVo login(String userName, String password) {
        return null;
    }

    @Override
    public boolean update(UserEntity entity) {
        return false;
    }

    @Override
    public boolean insert(UserEntity entity) {
        return false;
    }

    @Override
    public boolean delete(Long userId) {
        return false;
    }
}
