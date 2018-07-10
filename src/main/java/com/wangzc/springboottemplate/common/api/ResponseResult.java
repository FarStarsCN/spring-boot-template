package com.wangzc.springboottemplate.common.api;

/**
 * api统一返回对象封装方法
 * @author wang_zc
 * @date 2018/7/9
 */
public class ResponseResult {

    public static ResponseData toData(int ret) {
        return getInstance(ret,null, BaseDataEnum.OK.msg);
    }

    public static<T> ResponseData toData(T data) {
        return getInstance(BaseDataEnum.OK.i, data, BaseDataEnum.OK.msg);
    }

    public static ResponseData toData(String msg) {
        return getInstance(BaseDataEnum.OK.i,null, msg);
    }

    public static<T> ResponseData toData(T data, String msg) {
        return getInstance(BaseDataEnum.OK.i, data, msg);
    }

    public static<T> ResponseData toData(int ret, T data) {
        return getInstance(ret, data, BaseDataEnum.OK.msg);
    }

    public static ResponseData toData(int ret, String msg) {
        return getInstance(ret, null, msg);
    }

    public static<T> ResponseData toData(int ret, T data, String msg) {
        return getInstance(ret, data, msg);
    }

    private static<T> ResponseData getInstance(int ret, T data, String msg) {
        return ResponseData.getInstance(ret, data, msg);
    }
}
