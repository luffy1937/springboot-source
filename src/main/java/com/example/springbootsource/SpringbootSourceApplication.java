package com.example.springbootsource;

import com.example.springbootsource.bean.ann.MyBeanImport;
import com.example.springbootsource.initializer.SecondInitializer;
import com.example.springbootsource.listener.SecondListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@SpringBootApplication
@RestController
@Import(MyBeanImport.class)
@PropertySource({"demo.properties"})
public class SpringbootSourceApplication {
	@Autowired
	TestService testService;
	public static void main(String[] args) {
	//	SpringApplication.run(SpringbootSourceApplication.class, args)

		SpringApplication springApplication = new SpringApplication(SpringbootSourceApplication.class);
		springApplication.addInitializers(new SecondInitializer());
		springApplication.addListeners(new SecondListener());
		Properties properties = new Properties();
		properties.setProperty("ping", "pang");
		springApplication.setDefaultProperties(properties);
		springApplication.run(args);
	}
	@GetMapping("/test")
	public String test(){
		return testService.test();
	}
}
