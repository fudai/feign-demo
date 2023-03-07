/**
 * Copyright (c) 2009-2023 fudai,Inc.All Rights Reserved.
 *
 * @fileName: ServiceProviderController
 * @package: com.fudai.spring.feigin.provider.controller
 * @date: 2023-02-17 15:14
 * @version: V1.0
 */
package com.fudai.spring.feign.provider.controller;

import com.fudai.spring.feign.provider.api.FeignClientApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @className: ServiceProviderController
 * @description: 服务提供者Controller
 * @author: fudai
 * @date: 2023-02-17 15:14
 */
@RestController
@RequestMapping("/provider")
@Slf4j
public class ServiceProviderController implements FeignClientApi {

    @Override
    public String sayHello(){
        log.info("hello");
        return "hello";
    }

    @Override
    public String testMultipart1(List<MultipartFile> files) {
        log.info("testMultipart1文件：{}", files);
        return "suceess";
    }

    @Override
    public String testMultipart2(MultipartRequest request) {
        log.info("testMultipart2文件：{}", request);
        return "suceess";
    }

    @Override
    public String testMultipart3(MultipartFile file) {
        log.info("testMultipart3文件：{}", file);
        return "suceess";
    }

    @Override
    public String testMultipart4(SingleMultipartRequest request) {
        log.info("testMultipart3文件：{}", request);
        return "suceess";
    }


}
