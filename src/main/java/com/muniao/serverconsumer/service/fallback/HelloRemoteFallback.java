package com.muniao.serverconsumer.service.fallback;

import com.muniao.serverconsumer.service.HelloRemote;
import com.muniao.serverconsumer.vo.UserVO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteFallback implements HelloRemote
{
    @Override
    public String hello(@RequestParam(value = "name") String name)
    {
        return "hello " +name+", this messge send failed ";
    }

    @Override
    public String printUser(UserVO user)
    {
        return "hello " +user.getUserName()+", this printUser send failed ";
    }
}
