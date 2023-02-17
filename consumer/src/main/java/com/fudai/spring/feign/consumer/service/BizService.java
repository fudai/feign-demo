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
import org.springframework.stereotype.Service;

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

    public void process() {
        log.info("process 结果：{}", feignClientApi.sayHello());
    }
}
