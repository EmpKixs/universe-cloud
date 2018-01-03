/*
 * Copyright (c) 2016 ywmj.com. All Rights Reserved.
 */
package com.universe.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangbing
 * @version 1.0, 2018/1/3
 */
@FeignClient(value = "EUREKA-CLIENT-SERVICE")
public interface HelloService {

    @RequestMapping(value = "/hello/hi", method = RequestMethod.GET)
    String sayHi(@RequestParam("name") String name);
}
