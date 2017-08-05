package com.xu.demo_springboot_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@RestController = @Controller + @ResponseBody  @Controller需配合模板使用
@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private GirlPropertier girl;

    @RequestMapping(value = "/say" ,method = RequestMethod.GET)
    public Integer say(@RequestParam(value = "id",required = false,defaultValue ="1") Integer myId){
        return  myId;
    }
}