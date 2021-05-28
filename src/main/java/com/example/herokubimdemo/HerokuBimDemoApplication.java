package com.example.herokubimdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@Controller
@SpringBootApplication
public class HerokuBimDemoApplication extends SpringBootServletInitializer {

	@RequestMapping("/")
	@ResponseBody
	String index() {
		return "Hello there! I'm running.OK!";
	}
	public static void main(String[] args) {
		SpringApplication.run(HerokuBimDemoApplication.class, args);
	}

}
