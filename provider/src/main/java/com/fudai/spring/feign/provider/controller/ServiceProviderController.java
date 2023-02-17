/**
 * Copyright (c) 2009-2023 fudai,Inc.All Rights Reserved.
 *
 * @fileName: ServiceProviderController
 * @package: com.fudai.spring.feigin.provider.controller
 * @date: 2023-02-17 15:14
 * @version: V1.0
 */
package com.fudai.spring.feign.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: ServiceProviderController
 * @description: 服务提供者Controller
 * @author: fudai
 * @date: 2023-02-17 15:14
 */
@RestController
@RequestMapping("/provider")
@Slf4j
public class ServiceProviderController {

    @GetMapping("/hello")
    public String sayHello(){
        log.info("hello");
        return "hello";
    }

}
