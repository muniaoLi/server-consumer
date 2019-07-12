package com.muniao.serverconsumer.controller;

import com.muniao.serverconsumer.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.muniao.serverconsumer.service.HelloRemote;

import java.util.Date;

@RestController
public class ConsumerController
{
    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name)
    {
        return helloRemote.hello(name);
    }

    @RequestMapping("/printUser/{name}/{age}")
    public String printUser(@PathVariable("name") String name,@PathVariable("age") int age)
    {
        UserVO user = new UserVO();
        user.setUserName(name);
        user.setAge(age);
        user.setBirthday(new Date());

        return helloRemote.printUser(user);
    }
}
