package com.example.springbootsource.bean.ann;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostprocesser implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        BeanDefinition teacher = configurableListableBeanFactory.getBeanDefinition("teacher");
        MutablePropertyValues propertyValues = teacher.getPropertyValues();
        propertyValues.add("name", "wangwu");
    }
}
