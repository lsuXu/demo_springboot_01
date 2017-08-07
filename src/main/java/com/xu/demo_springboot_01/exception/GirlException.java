package com.xu.demo_springboot_01.exception;

import com.xu.demo_springboot_01.enums.ResultEnum;

public class GirlException extends RuntimeException{

    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    };

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
