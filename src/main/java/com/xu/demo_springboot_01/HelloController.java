package com.xu.demo_springboot_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @Autowired
    private Girl girl;

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String say(){
    //    return girl.getName();
        return "index";
    }
}
