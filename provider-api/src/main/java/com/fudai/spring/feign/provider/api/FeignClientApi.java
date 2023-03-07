/**
 * Copyright (c) 2009-2023 fudai,Inc.All Rights Reserved.
 *
 * @fileName: FeignClientApi
 * @package: com.fudai.spring.feigin.provider.api
 * @date: 2023-02-17 15:05
 * @version: V1.0
 */
package com.fudai.spring.feign.provider.api;

import feign.Headers;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import java.util.List;

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

    @PostMapping(value = "/testMultipart1", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String testMultipart1(@RequestPart("files") List<MultipartFile> files);

    @PostMapping(value = "/testMultipart2", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @Headers("Content-Type:multipart/form-data")
    String testMultipart2(MultipartRequest request);

    @PostMapping(value = "/testMultipart3", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String testMultipart3(MultipartFile file);

    @PostMapping(value = "/testMultipart4", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String testMultipart4(SingleMultipartRequest request);

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    class SingleMultipartRequest{
        private MultipartFile file;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    class MultipartRequest{
        private List<MultipartFile> files;
    }

}
