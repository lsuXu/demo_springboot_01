package com.xu.demo_springboot_01.services;

import com.xu.demo_springboot_01.domain.Girl;
import com.xu.demo_springboot_01.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void saveTwo(){
        Girl girlA = new Girl();
        girlA.setName("星星");
        girlA.setAge( 12 );
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setName("The Apple");
        girlB.setAge( 11 );
        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws Exception{
        Integer age = girlRepository.findOne(id).getAge();
        if(age<10){
            throw new Exception("你太嫩了");
        }else if(age <16){
            throw new Exception("你在大一点就好了");
        }else{
            throw new Exception("可以了");
        }
    }
}
