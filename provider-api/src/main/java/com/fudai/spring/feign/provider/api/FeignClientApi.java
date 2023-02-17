/**
 * Copyright (c) 2009-2023 fudai,Inc.All Rights Reserved.
 *
 * @fileName: FeignClientApi
 * @package: com.fudai.spring.feigin.provider.api
 * @date: 2023-02-17 15:05
 * @version: V1.0
 */
package com.fudai.spring.feign.provider.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @className: FeignClientApi
 * @description: Feign客户端API
 * @author: fudai
 * @date: 2023-02-17 15:05
 */
@FeignClient(name = "feign-provider", value = "feign-provider", path = "/provider",url= "${feign-provider.url}")
public interface FeignClientApi {

    @GetMapping("/hello")
    String sayHello();

}
