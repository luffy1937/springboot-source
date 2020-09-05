package com.example.springbootsource;

import com.example.springbootsource.event.WeatherRunListener;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootSourceApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	WeatherRunListener weatherRunListener;
	@Test
	void testRun(){
		weatherRunListener.rain();
		weatherRunListener.snow();
	}
}
