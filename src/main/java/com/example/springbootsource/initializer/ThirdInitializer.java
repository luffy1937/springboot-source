package com.example.springbootsource.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;


public class ThirdInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        ConfigurableEnvironment environment = configurableApplicationContext.getEnvironment();
        Map<String, Object> map =  new HashMap<>();
        map.put("key3", "value3");
        MapPropertySource propertySource = new MapPropertySource("ThirdInitializer", map);
        environment.getPropertySources().addLast(propertySource);
        System.out.println("run ThirdInitializer");
    }
}
