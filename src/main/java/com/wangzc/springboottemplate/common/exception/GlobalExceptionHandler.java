package com.wangzc.springboottemplate.common.exception;

import com.wangzc.springboottemplate.common.api.ResponseData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理
 * @author wang_zc
 * @date 2018/7/10
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = MyRuntimeException.class)
    @ResponseBody
    public ResponseData exceptionHandler(MyRuntimeException e) {
        return e.getResponseData();
    }

}
