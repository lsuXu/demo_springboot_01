package com.xu.demo_springboot_01.utils;

import com.xu.demo_springboot_01.domain.Result;

public class ResultUtil {

    //成功返回数据
    public static Result success(Object obj){
        Result result = new Result();
        result.setCode(1);
        result.setMsg("success");
        result.setData(obj);
        return result;
    }

    //成功不返回数据
    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setMsg(msg);
        result.setCode(code);
        return result;
    }
}
