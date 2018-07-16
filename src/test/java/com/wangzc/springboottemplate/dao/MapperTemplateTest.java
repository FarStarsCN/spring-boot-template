package com.wangzc.springboottemplate.dao;

import com.wangzc.springboottemplate.model.po.IPO;
import com.wangzc.springboottemplate.model.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author wang_zc
 * @date 2018/7/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTemplateTest {

    @Autowired
    private MapperTemplate mapperTemplate;

    @Test
    public void insert() {
        User user = new User();
        user.setUsername("tom");
        user.setPassword("123456");
        mapperTemplate.insert(user);
        System.out.println(user);
    }

    @Test
    public void selectList() {
        List<IPO> users = mapperTemplate.selectList("user.findAll");
        users.forEach(user -> System.out.println(user.toString()));
    }
}