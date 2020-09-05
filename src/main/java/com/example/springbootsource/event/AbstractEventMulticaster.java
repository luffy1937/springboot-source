package com.example.springbootsource.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public abstract class AbstractEventMulticaster implements EventMulticaster{
    @Autowired
    private List<WeatherListener> listenerList;
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
