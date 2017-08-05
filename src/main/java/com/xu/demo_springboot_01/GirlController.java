package com.xu.demo_springboot_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    public class GirlController {

        @Autowired
        private GirlRepository girlRepository;

        @Autowired
        private GirlService girlService;

        //查询女生列表
        @GetMapping(value = "/girls")
        public List<Girl> girls(){
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
        public Girl girls(@RequestParam("name") String name,@RequestParam("age") Integer age){
            Girl girl = new Girl();
            girl.setAge(age);
            girl.setName(name);
            return girlRepository.save(girl);
        }


        //插入两个女生
        @GetMapping(value = "/saveTwo")
        public void saveTwo(){
            girlService.saveTwo();
        }
    }
