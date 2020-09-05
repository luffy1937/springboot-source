package com.example.springbootsource.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

@Order(1)
public class FirstInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        ConfigurableEnvironment environment = configurableApplicationContext.getEnvironment();
        Map<String, Object> map =  new HashMap<>();
        map.put("key1", "value1");
        MapPropertySource propertySource = new MapPropertySource("firstInitializer", map);
        environment.getPropertySources().addLast(propertySource);
        System.out.println("run firstInitializer");
    }
}
