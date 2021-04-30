package com.yang.medical.entity;

public class Result {

    private int code;
    private Object data;
    public Result() {}
    public Result(int code, Object data) {
        super();
        this.code = code;
        this.data = data;
    }
    public Result(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

}