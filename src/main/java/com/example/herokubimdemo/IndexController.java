package com.example.herokubimdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ResponseBody
@RestController
public class IndexController {
    @RequestMapping("/")
    String index() {
        return "Hello there! I'm running.";
    }
}