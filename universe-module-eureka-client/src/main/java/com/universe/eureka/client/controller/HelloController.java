/*
 * Copyright (c) 2016 ywmj.com. All Rights Reserved.
 */
package com.universe.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangbing
 * @version 1.0, 2018/1/3
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
