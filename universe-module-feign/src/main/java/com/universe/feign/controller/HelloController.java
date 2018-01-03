/*
 * Copyright (c) 2016 ywmj.com. All Rights Reserved.
 */
package com.universe.feign.controller;

import com.universe.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangbing
 * @version 1.0, 2018/1/3
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "{name}", method = RequestMethod.GET)
    public String hello(
            @PathVariable("name") String name) {

        return helloService.sayHi(name);
    }
}
