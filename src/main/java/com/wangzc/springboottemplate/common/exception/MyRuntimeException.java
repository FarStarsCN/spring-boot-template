package com.wangzc.springboottemplate.common.exception;

import com.wangzc.springboottemplate.common.api.ResponseData;
import com.wangzc.springboottemplate.common.api.ResponseResult;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author wang_zc
 * @date 2018/7/10
 */
@NoArgsConstructor
@Getter
public class MyRuntimeException extends RuntimeException {

    private ResponseData responseData;

    public MyRuntimeException(String msg) {
        this.responseData = ResponseResult.toData(500, msg);
    }

    public MyRuntimeException(ResponseData responseData) {
        this.responseData = responseData;
    }
}
