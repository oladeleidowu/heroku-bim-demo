package com.example.herokubimdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@ResponseBody
@Controller
public class HerokuBimDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(HerokuBimDemoApplication.class, args);
	}

}
