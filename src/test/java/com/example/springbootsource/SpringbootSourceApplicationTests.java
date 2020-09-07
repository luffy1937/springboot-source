package com.example.springbootsource;

import com.example.springbootsource.bean.ann.MyBeanImport;
import com.example.springbootsource.bean.ann.Teacher;
import com.example.springbootsource.bean.xml.HelloService;
import com.example.springbootsource.event.WeatherRunListener;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(properties = {"test=test1"})
//@ContextConfiguration(locations = "classpath:ioc/demo.xml")
	//@Import(MyBeanImport.class)
class SpringbootSourceApplicationTests {
	@Autowired
	HelloService helloService;

	@Test
	void testhello(){
		//System.out.println(helloService.hello());
		System.out.println(helloService.helloAnimal());
	}
	@Test
	void contextLoads() {
	}
	@Autowired
	Teacher teacher;
	@Test
	void testPost(){
		System.out.println(teacher.getName());
	}

}
