package com.wangzc.springboottemplate.dao;

import com.wangzc.springboottemplate.model.po.User;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;
import java.util.List;

/**
 * @author wang_zc
 * @date 2018/7/11
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * 查询所有
     * @author wang_zc
     * @return java.util.List<com.wangzc.springboottemplate.model.po.User>
     */
    List<User> findAll();
}
