package com.example.springbootsource.event;

public class RainEvent extends WeatherEvent {
    @Override
    public String getWeather() {
        return "rain";
    }
}
