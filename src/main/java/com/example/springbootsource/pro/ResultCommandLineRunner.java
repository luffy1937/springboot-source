package com.example.springbootsource.pro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ResultCommandLineRunner implements CommandLineRunner, EnvironmentAware {
    private Environment environment;
    @Override
    public void run(String... args) throws Exception {

        System.out.println(environment.getProperty("ping"));
        System.out.println(environment.getProperty("pingint"));
        System.out.println(environment.getProperty("system.path"));
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
