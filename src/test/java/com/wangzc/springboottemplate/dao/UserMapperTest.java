package com.wangzc.springboottemplate.dao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangzc.springboottemplate.model.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author wang_zc
 * @date 2018/7/11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findAll() {
        List<User> list = userMapper.findAll();
        list.forEach(user -> System.out.println(user.toString()));
    }

    @Test
    public void pageHelper() {
        final PageInfo<User> pageInfo = PageHelper.startPage(1, 10)
                .setOrderBy("id asc")
                .doSelectPageInfo(() -> this.userMapper.findAll());
        pageInfo.getList().forEach(user -> System.out.println(user.toString()));
    }
}