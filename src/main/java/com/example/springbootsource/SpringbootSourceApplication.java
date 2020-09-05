package com.example.springbootsource;

import com.example.springbootsource.initializer.SecondInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootSourceApplication {
	@Autowired
	TestService testService;
	public static void main(String[] args) {
	//	SpringApplication.run(SpringbootSourceApplication.class, args)

		SpringApplication springApplication = new SpringApplication(SpringbootSourceApplication.class);
		springApplication.addInitializers(new SecondInitializer());
		springApplication.run(args);
	}
	@GetMapping("/test")
	public String test(){
		return testService.test();
	}
}
