package com.wangzc.springboottemplate.common.api;

/**
 * @author wang_zc
 * @date 2018/7/9
 */
public enum BaseDataEnum {

    // 返回码code.200表示正常返回
    OK(200, "success"),
    // 版本号
    ERROR(500, "服务器异常");

    public int i;

    public String msg;

    BaseDataEnum(int i, String msg) {
        this.i = i;
        this.msg = msg;
    }
}
