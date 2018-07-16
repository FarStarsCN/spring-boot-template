package com.wangzc.springboottemplate.controller;

import com.wangzc.springboottemplate.common.api.ResponseData;
import com.wangzc.springboottemplate.common.api.ResponseResult;
import com.wangzc.springboottemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wang_zc
 * @date 2018/7/12
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/findAll")
    public ResponseData findAll() {
        return ResponseResult.toData(userService.findAll());
    }
}
