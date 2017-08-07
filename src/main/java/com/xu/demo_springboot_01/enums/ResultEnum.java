package com.xu.demo_springboot_01.enums;

public enum ResultEnum {
    SYSTEM_ERROR(-1,"系统错误"),
    TO_SMALL(100,"太小了"),
    TO_MUCH_SMALL(101,"实在太小了");

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
