package com.example.springbootsource.event;

import org.springframework.stereotype.Component;

@Component
public class WeatherEventMulticaster extends AbstractEventMulticaster {
    @Override
    void doStart() {
        System.out.println("start cast");
    }

    @Override
    void doEnd() {
        System.out.println("end cast");
    }
}
