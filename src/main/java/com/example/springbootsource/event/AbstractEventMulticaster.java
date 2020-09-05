package com.example.springbootsource.event;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEventMulticaster implements EventMulticaster{
    List<WeatherListener> listenerList = new ArrayList<>();
    public void multicastEvent(WeatherEvent event) {
        doStart();
        listenerList.forEach(i -> i.onWeatherEvent(event));
        doEnd();
    }

    public void addListener(WeatherListener listener) {
        listenerList.add(listener);
    }

    public void removeListener(WeatherListener listener) {
        listenerList.remove(listener);
    }

    abstract void doStart();
    abstract void doEnd();
}
