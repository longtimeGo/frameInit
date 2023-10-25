package com.example.ownframe.handler;

import com.example.ownframe.result.Result;
import com.example.ownframe.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler
    public Result handleException(Exception e){

        // 获取异常信息
        String msg = e.getMessage();
        if(msg == null || msg.equals("")){
            msg = "服务器错误";
        }

        return ResultUtil.error(500, msg);
    }

}
