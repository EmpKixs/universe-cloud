/*
 * Copyright (c) 2016 ywmj.com. All Rights Reserved.
 */
package com.universe.ribbon.controller;

import com.universe.ribbon.service.HelloService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author wangbing
 * @version 1.0, 2018/1/3
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping(value = "{name}", method = RequestMethod.GET)
    public String hello(@PathVariable("name") String name) {

        return helloService.hiService(name);
    }
}
