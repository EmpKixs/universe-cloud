/*
 * Copyright (c) 2016 ywmj.com. All Rights Reserved.
 */
package com.universe.feign.service;

import org.springframework.stereotype.Component;

/**
 * @author wangbing
 * @version 1.0, 2018/1/3
 */
@Component
public class HelloServiceError implements HelloService {

    @Override
    public String sayHi(String name) {
        return "hi," + name + "!There has occurred some error!";
    }
}
