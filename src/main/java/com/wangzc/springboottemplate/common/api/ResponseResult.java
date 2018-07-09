package com.wangzc.springboottemplate.common.api;

/**
 * api统一返回对象封装方法
 * @author wang_zc
 * @date 2018/7/9
 */
public class ResponseResult {

    public static<T> ResponseData toData(T data) {
        return toData(BaseDataEnum.RET.i, data);
    }

    public static ResponseData toData(String msg) {
        return toData(BaseDataEnum.RET.i, msg);
    }

    public static<T> ResponseData toData(T data, String msg) {
        return toData(BaseDataEnum.RET.i, data, msg);
    }

    public static<T> ResponseData toData(int ret, T data) {
        return ResponseData.getInstance(ret, data);
    }

    public static ResponseData toData(int ret, String msg) {
        return ResponseData.getInstance(ret, msg);
    }

    public static<T> ResponseData toData(int ret, T data, String msg) {
        return ResponseData.getInstance(ret, data, msg);
    }
}
