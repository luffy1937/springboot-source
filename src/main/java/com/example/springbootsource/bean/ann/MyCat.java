package com.example.springbootsource.bean.ann;

import com.example.springbootsource.bean.xml.Animal;
import com.example.springbootsource.bean.xml.Cat;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyCat implements FactoryBean<Cat> {
    @Override
    public Cat getObject() throws Exception {
        return new Cat();
    }

    @Override
    public Class<?> getObjectType() {
        return Animal.class;
    }
}
