package com.xu.demo_springboot_01;

import org.springframework.data.jpa.repository.JpaRepository;

//<Girl,Integer>,第一个为需要操作的bean类，第二个参数为bean类中的Id类型，即对应数据库表中的主键类型
public interface GirlRepository extends JpaRepository<Girl,Integer> {
}
