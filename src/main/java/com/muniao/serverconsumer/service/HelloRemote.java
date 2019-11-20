package com.muniao.serverconsumer.service;

import com.muniao.serverconsumer.config.FeginLogConfig;
import com.muniao.serverconsumer.service.fallback.HelloRemoteFallback;
import com.muniao.serverconsumer.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "server-producer",
        fallback = HelloRemoteFallback.class)
public interface HelloRemote
{
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);

    @RequestMapping("/printUser")
    String printUser(@RequestBody UserVO user);
}
