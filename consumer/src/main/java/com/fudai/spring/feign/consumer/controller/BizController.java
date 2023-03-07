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
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

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
        bizService.sayHello();
        return "success";
    }

    @PostMapping("/testMultipart1")
    public String testMultipart1(MultipartFile file) {
        bizService.testMultipart1(file);
        return "success";
    }

    @PostMapping("/testMultipart2")
    public String testMultipart2(MultipartFile file) {
        bizService.testMultipart2(file);
        return "success";
    }

    @PostMapping("/testMultipart3")
    public String testMultipart3(MultipartFile file) {
        bizService.testMultipart3(file);
        return "success";
    }

    @PostMapping("/testMultipart4")
    public String testMultipart4(MultipartFile file) {
        bizService.testMultipart4(file);
        return "success";
    }
}
