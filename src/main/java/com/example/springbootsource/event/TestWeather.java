package com.example.springbootsource.event;

public class TestWeather {
    public static void main(String[] args) {
        WeatherEventMulticaster weatherEventMulticaster = new WeatherEventMulticaster();
        SnowListener snowListener = new SnowListener();
        RainListener rainListener = new RainListener();
        weatherEventMulticaster.addListener(snowListener);
        weatherEventMulticaster.addListener(rainListener);
        weatherEventMulticaster.multicastEvent(new SnowEvent());
        weatherEventMulticaster.multicastEvent(new RainEvent());
        weatherEventMulticaster.removeListener(rainListener);
        weatherEventMulticaster.multicastEvent(new RainEvent());

    }
}
