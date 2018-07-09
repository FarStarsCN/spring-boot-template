package com.wangzc.springboottemplate.common.api;

/**
 * @author wang_zc
 * @date 2018/7/9
 */
public enum BaseDataEnum {

    // 返回码code.0表示正常返回
    RET(0),
    // 版本号
    VERSION("1.0.0");

    public int i;

    public String s;

    BaseDataEnum(Object value) {
        if (value instanceof Integer) {
            this.i = (int) value;
        } else if (value instanceof String) {
            this.s = (String) value;
        }
    }
}
