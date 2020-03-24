package com.lckj.springcloud.common;

public enum StatusCode {

    SUCCESS(0,"成功"),
    FAIL(-1,"失败"),
    NOTFUND(10010,"不存在"),
    ENTITY_NOT_EXIT(10011,"实体信息不存在"),
    INVALID_PARAMS(10012,"请求参数不合法!");

    private Integer code;
    private String msg;


    StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

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

}
