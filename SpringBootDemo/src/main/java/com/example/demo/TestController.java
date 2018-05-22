package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /*
    http://localhost:8080/
    */
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }


    /*
    测试application.propertires文件作用
    http://localhost:8080/testapplicationpropertires
    */
    @Value("${testdemo.name}")
    private String name;
    @Value("${testdemo.age}")
    private int age;

    @RequestMapping("/testapplicationpropertires")
    public String testapplication(){
        return name+":"+age;
    }
}
