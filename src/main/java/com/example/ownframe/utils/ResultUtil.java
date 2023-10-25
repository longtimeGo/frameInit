package com.example.ownframe.utils;

import com.example.ownframe.enums.ResultCode;
import com.example.ownframe.result.Result;

public class ResultUtil {
    /**
     * 成功不带数据
     * @return
     */
    public static Result success(){
        return success(null);
    }

    /**
     * 成功带数据
     * @param object 数据
     * @return
     */
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(ResultCode.SUCCESS.code());
        result.setMsg(ResultCode.SUCCESS.message());
        result.setData(object);
        return result;
    }

    /**
     * 成功带提示及数据
     * @param object 数据
     * @return
     */
    public static Result success(String msg, Object object){
        Result result = new Result();
        result.setCode(ResultCode.SUCCESS.code());
        result.setMsg(msg);
        result.setData(object);
        return result;
    }

    /**
     * 失败
     * @param code 错误码
     * @param msg 提示信息
     * @return
     */
    public static Result error(Integer code , String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result error(ResultCode resultCode) {
        Result result = new Result();
        result.setCode(resultCode.code());
        result.setMsg(resultCode.message());
        return result;
    }

}
