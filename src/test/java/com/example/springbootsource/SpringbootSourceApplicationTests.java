package com.example.springbootsource;

import com.example.springbootsource.bean.xml.HelloService;
import com.example.springbootsource.event.WeatherRunListener;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
//@ContextConfiguration(locations = "classpath:ioc/demo.xml")
class SpringbootSourceApplicationTests {
	@Autowired
	HelloService helloService;

	@Test
	void testhello(){
		System.out.println(helloService.hello());
		//System.out.println(helloService.helloAnimal());
	}
	@Test
	void contextLoads() {
	}

}
