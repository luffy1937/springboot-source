package com.example.springbootsource.event;

public interface EventMulticaster {
    void multicastEvent(WeatherEvent event);
    void addListener(WeatherListener listener);
    void removeListener(WeatherListener listener);
}
