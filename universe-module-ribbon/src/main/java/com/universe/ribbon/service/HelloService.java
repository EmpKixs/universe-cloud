/*
 * Copyright (c) 2016 ywmj.com. All Rights Reserved.
 */
package com.universe.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author wangbing
 * @version 1.0, 2018/1/3
 */
@Service
public class HelloService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT-SERVICE/hello/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi," + name + "!There has occurred some error!";
    }
}
