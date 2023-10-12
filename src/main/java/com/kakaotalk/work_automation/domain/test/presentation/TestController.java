package com.kakaotalk.work_automation.domain.test.presentation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {
    @RequestMapping("msg")
    private String testMsg(){
        return "hello world";
    }
}
