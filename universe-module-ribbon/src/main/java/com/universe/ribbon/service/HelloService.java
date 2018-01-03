/*
 * Copyright (c) 2016 ywmj.com. All Rights Reserved.
 */
package com.universe.ribbon.service;

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

    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT-SERVICE/hello/hi?name="+name,String.class);
    }
}
