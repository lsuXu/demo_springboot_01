package com.xu.demo_springboot_01;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//获取前缀是girl的配置,将其映射过来
@ConfigurationProperties(prefix = "girl")
//要注入使用，将类转换为bean,使得在其他类中通过@Autowired注入
@Component
public class Girl {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
