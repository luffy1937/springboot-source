package com.example.springbootsource.bean.ann;

import com.example.springbootsource.bean.xml.Animal;
import com.example.springbootsource.bean.xml.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean("dog")
    Animal getDog(){
        return new Dog();
    }
}
