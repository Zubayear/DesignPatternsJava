package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    List<Observer> observers;
    private double temperature;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
