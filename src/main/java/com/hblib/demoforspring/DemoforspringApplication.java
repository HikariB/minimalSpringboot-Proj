package com.hblib.demoforspring;

import com.hblib.demoforspring.mapper.UserDOMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hblib.demoforspring.mapper")
public class  DemoforspringApplication {

    @Autowired
    private static UserDOMapper userDOMapper;


    public static void main(String[] args) {


        
        SpringApplication.run(DemoforspringApplication.class, args);

    }

}
