package com.wangzc.springboottemplate.service;

import com.wangzc.springboottemplate.model.po.User;

import java.util.List;

/**
 * @author wang_zc
 * @date 2018/7/12
 */
public interface UserService {

    /**
     * 查询所有User
     * @author wang_zc
     * @return java.util.List<com.wangzc.springboottemplate.model.po.User>
     */
    List<User> findAll();
}
