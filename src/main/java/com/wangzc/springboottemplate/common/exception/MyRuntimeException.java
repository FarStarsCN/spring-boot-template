package com.wangzc.springboottemplate.common.exception;

import com.wangzc.springboottemplate.common.api.ResponseData;
import com.wangzc.springboottemplate.common.api.ResponseResult;
import lombok.Getter;

/**
 * @author wang_zc
 * @date 2018/7/10
 */
@Getter
public class MyRuntimeException extends RuntimeException {

    private ResponseData responseData;

    public MyRuntimeException() {
        this.responseData = ResponseResult.toData(500, "服务器异常");
    }

    public MyRuntimeException(String msg) {
        this.responseData = ResponseResult.toData(500, msg);
    }

    public MyRuntimeException(ResponseData responseData) {
        this.responseData = responseData;
    }
}
