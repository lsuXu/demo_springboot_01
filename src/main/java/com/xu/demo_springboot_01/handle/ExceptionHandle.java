package com.xu.demo_springboot_01.handle;

import com.xu.demo_springboot_01.domain.Result;
import com.xu.demo_springboot_01.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler
    @ResponseBody //捕获的一场将下面的方法作为返回主体
    public Result handle(Exception e){
        return ResultUtil.error(100,e.getMessage());
    }
}
