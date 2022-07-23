package com.util;

public class Result<T> {
    private T data;
    private String code;
    private String msg;


    public Result() {
        this.code = "200";
        this.msg = "操作成功！";
    }

    public Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(T data) {
        this.data = data;
        this.code = "200";
        this.msg = "操作成功！";
    }

    public Result(T data, String msg) {
        this.data = data;
        this.code = "200";
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
