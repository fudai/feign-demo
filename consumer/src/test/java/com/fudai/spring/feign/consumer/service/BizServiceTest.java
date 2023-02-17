package com.fudai.spring.feign.consumer.service;

import com.fudai.spring.feign.consumer.Bootstrap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @className: BizServiceTest
 * @description:
 * @author: fudai
 * @date: 2023-02-17 16:01
 */
@SpringBootTest(classes = Bootstrap.class)
@RunWith(SpringRunner.class)
public class BizServiceTest {

    @Autowired
    private BizService bizService;

    @Test
    public void process() {
        bizService.process();
    }
}