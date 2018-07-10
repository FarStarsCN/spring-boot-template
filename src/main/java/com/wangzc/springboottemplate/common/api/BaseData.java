package com.wangzc.springboottemplate.common.api;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wang_zc
 * @date 2018/7/9
 */
@Getter
@Setter
abstract class BaseData<T> {

    /**
     * code
     */
    private int ret;

    /**
     * 数据
     */
    private T data;

    /**
     * 信息
     */
    private String msg;
}
