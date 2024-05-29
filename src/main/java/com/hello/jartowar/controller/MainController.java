package com.hello.jartowar.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MainController {

    @GetMapping("/hello")
    public String hello() {
        log.info("hello controller!!");
        return "hello";
    }
}
