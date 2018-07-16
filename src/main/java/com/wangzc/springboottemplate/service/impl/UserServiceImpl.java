package com.wangzc.springboottemplate.service.impl;

import com.wangzc.springboottemplate.dao.UserMapper;
import com.wangzc.springboottemplate.model.po.User;
import com.wangzc.springboottemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wang_zc
 * @date 2018/7/12
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * 查询所有User
     * @return java.util.List<com.wangzc.springboottemplate.model.po.User>
     * @author wang_zc
     */
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
