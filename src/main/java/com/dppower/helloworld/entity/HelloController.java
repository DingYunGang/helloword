package com.dppower.helloworld.entity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/helloworld")
    public String HelloWorld(){
        return "Hello World!";
    }
}
