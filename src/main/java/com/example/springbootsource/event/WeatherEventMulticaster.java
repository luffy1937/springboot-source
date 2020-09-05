package com.example.springbootsource.event;

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
