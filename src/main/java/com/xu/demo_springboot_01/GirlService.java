package com.xu.demo_springboot_01;

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
}
