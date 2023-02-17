/**
 * Copyright (c) 2009-2023 fudai,Inc.All Rights Reserved.
 *
 * @fileName: BizController
 * @package: com.fudai.spring.feign.cousumer.controller
 * @date: 2023-02-17 16:01
 * @version: V1.0
 */
package com.fudai.spring.feign.consumer.controller;

import com.fudai.spring.feign.consumer.service.BizService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: BizController
 * @description:
 * @author: fudai
 * @date: 2023-02-17 16:01
 */
@RestController
@RequestMapping("/consumer")
@Slf4j
public class BizController {

    @Autowired
    private BizService bizService;

    @GetMapping("/test")
    public String sayHello(){
        bizService.process();
        return "success";
    }
}
