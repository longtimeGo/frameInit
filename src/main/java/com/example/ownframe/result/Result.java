package com.example.ownframe.result;

import lombok.Data;

@Data
public class Result <T>{

    private Integer code;
    private String msg;
    private T data;

    public Result(){
        super();
    }

    public Result(Integer code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
