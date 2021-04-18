package com.example.demo.controller;

import com.example.demo.annotest.OutPutLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Classname Test
 * @Description 测试自定义注解+AOP打印日志
 * @Date 2021/4/18 21:50
 * @Created by zhongzs
 */
@RestController
public class AopTest {
    @GetMapping("/test")
    @OutPutLog
    public  String  testController(){
        return  "测试aop打印日志";
    }
}
