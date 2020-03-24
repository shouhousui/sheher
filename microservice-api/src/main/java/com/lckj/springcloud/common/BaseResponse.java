package com.lckj.springcloud.common;

public class BaseResponse<T> {

    /**
     * 操作结果编码
     */
    private Integer code;

    /**
     * 操作结果描述信息
     */
    private String msg;

    /**
     * 操作结果数据
     */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public T getData() {

        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
