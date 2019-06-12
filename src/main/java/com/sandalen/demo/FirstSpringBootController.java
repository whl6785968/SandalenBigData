package com.sandalen.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
public class FirstSpringBootController {
    @RequestMapping("/hello")
    public String hello()
    {
        return "hello.html";
    }
}
