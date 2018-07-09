package com.wangzc.springboottemplate.common.api;

/**
 * api统一返回对象
 * @author wang_zc
 * @date 2018/7/9
 */
public class ResponseData extends BaseData {

    private static ThreadLocal<ResponseData> local = ThreadLocal.withInitial(ResponseData::new);

    public static ResponseData getInstance() {
        return local.get();
    }

    public static ResponseData getInstance(int ret, String msg) {
        ResponseData responseData = local.get();
        responseData.setRet(ret);
        responseData.setMsg(msg);
        return responseData;
    }

    public static<T> ResponseData getInstance(int ret, T data) {
        ResponseData responseData = local.get();
        responseData.setRet(ret);
        responseData.setData(data);
        return responseData;
    }

    public static<T> ResponseData getInstance(int ret, T data, String msg) {
        ResponseData responseData = local.get();
        responseData.setRet(ret);
        responseData.setData(data);
        responseData.setMsg(msg);
        return responseData;
    }
}
