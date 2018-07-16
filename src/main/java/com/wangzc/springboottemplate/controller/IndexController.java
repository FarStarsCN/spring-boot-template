package com.wangzc.springboottemplate.controller;

import com.wangzc.springboottemplate.common.api.ResponseData;
import com.wangzc.springboottemplate.common.api.ResponseResult;
import com.wangzc.springboottemplate.common.exception.MyRuntimeException;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wang_zc
 * @date 2018/7/9
 */
@Controller
@RequestMapping
public class IndexController {

    @ApiOperation(value = "跳转首页", notes = "跳转到项目首页")
    @GetMapping
    public String index() {
        return "index";
    }

    @ApiOperation("hello world")
    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello world";
    }

    @ApiOperation("getResponseData")
    @GetMapping("getResponseData")
    @ResponseBody
    public ResponseData getResponseData(@RequestParam String msg) {
        return ResponseResult.toData(msg);
    }

    @ApiOperation("抛出异常")
    @GetMapping("throwException")
    public String throwException() {
        throw new MyRuntimeException("服务器异常");
    }
}
