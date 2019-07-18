package com.hblib.demoforspring;

import com.hblib.demoforspring.mapper.UserDOMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoforspringApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());

    private UserDOMapper userDOMapper;


    @Test
    public void contextLoads() {
       //日志级别由低到高
        logger.trace("");
        logger.debug("");
        logger.info("");
        logger.warn("");
        logger.error("");

    }


}
