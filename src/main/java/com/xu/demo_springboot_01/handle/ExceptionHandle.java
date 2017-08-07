package com.xu.demo_springboot_01.handle;

import com.xu.demo_springboot_01.domain.Result;
import com.xu.demo_springboot_01.exception.GirlException;
import com.xu.demo_springboot_01.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    private static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)//声明需要捕获的异常类
    @ResponseBody //捕获的一场将下面的方法作为返回主体
    public Result handle(Exception e){
        if(e instanceof GirlException){//判断e是不是GirlException的实例，若是，返回True
            GirlException girlException = (GirlException)e;
            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }else{
            logger.error("系统错误：{}",e);
            return ResultUtil.error(-1,"系统错误");
        }
    }
}
