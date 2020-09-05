package com.example.springbootsource.event;

public class RainListener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if(event instanceof SnowEvent){
            System.out.println("hello " + event.getWeather());
        }
    }
}
