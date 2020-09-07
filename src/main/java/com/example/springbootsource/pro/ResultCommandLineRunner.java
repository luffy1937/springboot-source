package com.example.springbootsource.pro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ResultCommandLineRunner implements CommandLineRunner, EnvironmentAware, MyAware {
    private Environment environment;
    private Flag flag;
    @Override
    public void run(String... args) throws Exception {

        System.out.println(environment.getProperty("ping"));
        System.out.println(environment.getProperty("pingint"));
        System.out.println(environment.getProperty("system.path"));
        System.out.println(environment.getProperty("vm.name"));
        System.out.println(flag.isCanOperate());
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void setFlag(Flag flag) {
        this.flag = flag;
    }
}
