package com.xu.demo_springboot_01.controller;

import com.xu.demo_springboot_01.aspect.HttpAspect;
import com.xu.demo_springboot_01.domain.Girl;
import com.xu.demo_springboot_01.repository.GirlRepository;
import com.xu.demo_springboot_01.services.GirlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

    @RestController
    public class GirlController {

        @Autowired
        private GirlRepository girlRepository;

        @Autowired
        private GirlService girlService;

        private final static Logger logger = LoggerFactory.getLogger(GirlController.class);

        //查询女生列表
        @GetMapping(value = "/girls")
        public List<Girl> girls(){
            logger.info("查询女生列表");
            return girlRepository.findAll();
        }

        //查询一个女生
        @GetMapping(value = "/girls/{id}")
        public Girl findOne(@PathVariable("id") Integer id){
            return girlRepository.findOne(id);
        }

        //更新一个女生
        @PutMapping(value = "/girls/{id}")
        public Girl updateGirl(@PathVariable("id") Integer id,@RequestParam("name") String name, @RequestParam("age") Integer age){
            Girl girl = new Girl();
            girl.setAge(age);
            girl.setName(name);
            girl.setId(id);
            return girlRepository.save(girl);
        }

        //删除一个女生
        @DeleteMapping(value = "/girls/{id}")
        public void deleteOne(@PathVariable("id") Integer id){
            girlRepository.delete(id);
        }

        //插入一个女生
        @PostMapping(value = "/girls")
        public Girl girls(@Valid Girl girl, BindingResult bindingResult){
            if(bindingResult.hasErrors()){
                System.out.println(bindingResult.getFieldError().getDefaultMessage());
                    return null;
            }
            return girlRepository.save(girl);
        }


        //插入两个女生
        @GetMapping(value = "/saveTwo")
        public void saveTwo(){
            girlService.saveTwo();
        }
    }
