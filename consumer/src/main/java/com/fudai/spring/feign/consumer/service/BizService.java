/**
 * Copyright (c) 2009-2023 fudai,Inc.All Rights Reserved.
 *
 * @fileName: BizService
 * @package: com.fudai.spring.feign.cousumer.service
 * @date: 2023-02-17 15:47
 * @version: V1.0
 */
package com.fudai.spring.feign.consumer.service;

import com.fudai.spring.feign.provider.api.FeignClientApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: BizService
 * @description: 业务服务
 * @author: fudai
 * @date: 2023-02-17 15:47
 */
@Service
@Slf4j
public class BizService {

    @Autowired
    private FeignClientApi feignClientApi;

    public void sayHello() {
        log.info("process 结果：{}", feignClientApi.sayHello());
    }

    public void testMultipart1(MultipartFile file) {
        List<MultipartFile> files = new ArrayList<>();
        files.add(file);
        log.info("testMultipart1 结果：{}", feignClientApi.testMultipart1(files));
    }

    public void testMultipart2(MultipartFile file) {
        List<MultipartFile> files = new ArrayList<>();
        files.add(file);
        log.info("testMultipart2 结果：{}", feignClientApi.testMultipart2(FeignClientApi.MultipartRequest.builder().files(files).build()));
    }


    public void testMultipart3(MultipartFile file) {
        log.info("testMultipart3 结果：{}", feignClientApi.testMultipart3(file));
    }

    public void testMultipart4(MultipartFile file) {
        log.info("testMultipart4 结果：{}", feignClientApi.testMultipart4(FeignClientApi.SingleMultipartRequest.builder().file(file).build()));
    }
}
