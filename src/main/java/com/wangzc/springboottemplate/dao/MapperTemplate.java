package com.wangzc.springboottemplate.dao;

import com.wangzc.springboottemplate.model.po.IPO;
import lombok.Getter;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 封装SqlSessionTemplate方便使用
 * insert：添加
 * update：修改
 * delete：删除
 * selectOne：查询一条
 * selectList：查询多条
 * @author wang_zc
 * @date 2018/7/16
 */
@Component
public class MapperTemplate {

    private String nameSpace;

    @Getter
    private SqlSessionTemplate sqlSessionTemplate;

    public int insert(IPO po) {
        nameSpace = this.getSimpleClassName(po).toLowerCase();
        return insert(nameSpace + ".insert", po);
    }

    public int insert(String sqlId, IPO po) {
        return this.sqlSessionTemplate.insert(sqlId, po);
    }

    public int update(IPO po) {
        nameSpace = this.getSimpleClassName(po).toLowerCase();
        return update(nameSpace + ".update", po);
    }

    public int update(String sqlId, IPO po) {
        return this.sqlSessionTemplate.update(sqlId, po);
    }

    public int delete(IPO po) {
        nameSpace = this.getSimpleClassName(po).toLowerCase();
        return delete(nameSpace + ".delete", po);
    }

    public int delete(String sqlId, IPO po) {
        return this.sqlSessionTemplate.delete(sqlId, po);
    }

    public IPO selectOne(String sqlId) {
        return this.sqlSessionTemplate.selectOne(sqlId);
    }

    public IPO selectOne(String sqlId, IPO po) {
        return this.sqlSessionTemplate.selectOne(sqlId, po);
    }

    public List<IPO> selectList(String sqlId) {
        return this.sqlSessionTemplate.selectList(sqlId);
    }

    public List<IPO> selectList(String sqlId, IPO po) {
        return this.sqlSessionTemplate.selectList(sqlId, po);
    }

    public SqlSessionFactory getSqlSessionFactory() {
        return this.sqlSessionTemplate.getSqlSessionFactory();
    }

    public SqlSession getSqlSession() {
        return this.getSqlSessionFactory().openSession();
    }

    /**
     * 用来注入SqlSessionTemplate
     * @author wang_zc
     */
    @Autowired
    public void setSqlMapClientForAutowire(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    /**
     * 通过反射获取简单类名
     * @author wang_zc
     * @param po 数据持久对象接口
     * @return java.lang.String
     */
    private String getSimpleClassName(IPO po) {
        return po.getClass().getSimpleName();
    }
}
