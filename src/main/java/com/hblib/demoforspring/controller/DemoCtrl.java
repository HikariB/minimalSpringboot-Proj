package com.hblib.demoforspring.controller;


import com.hblib.demoforspring.mapper.ToolistDOMapper;
import com.hblib.demoforspring.mapper.UserDOMapper;
import com.hblib.demoforspring.pojo.ToolistDO;
import com.hblib.demoforspring.pojo.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@EnableAutoConfiguration
public class DemoCtrl {

    @Autowired
    private UserDOMapper userDOMapper;

    @Autowired
    private ToolistDOMapper toolistDOMapper;
    //
    @RequestMapping("/success")
    public String success() {
        return "success";
    }

    @RequestMapping("/testboot")
    @ResponseBody
    public UserDO getUser(){
        UserDO userDO =new UserDO();
//        userDO.setUsername("first");
        userDO = userDOMapper.findById(5);
        return userDO;
    }

    @RequestMapping("/insert")
    public String  save(){
        UserDO userDO = new UserDO();
        userDO.setUsername("firstPerson");
        userDO.setPassword("pass");
        userDO.setCreateTime(new Date());
        userDOMapper.save(userDO);
        return "success";
    }

    @RequestMapping("/insertList")
    public String  saveList(){
        ToolistDO toolistDO = new ToolistDO();
        toolistDO.setName("key");
        toolistDO.setUserId(8);
        toolistDOMapper.insertSelective(toolistDO);
        return "success";
    }

    @RequestMapping("/find")
    public List<UserDO> findByName(){
        List<UserDO> LuserDO = userDOMapper.findByName("firstPerson");
        return LuserDO;
    }

}
