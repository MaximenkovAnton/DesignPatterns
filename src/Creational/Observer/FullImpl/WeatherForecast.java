package Creational.Observer.FullImpl;

import java.util.ArrayList;

class WeatherForecast extends Forcast {
    private ArrayList<Observer> observers;
    private WeatherInfo weatherInfo;

    WeatherForecast() {
        observers = new ArrayList<>();
    }

    @Override
    void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    void notifyObservers() {
        WeatherInfo weatherInfo = this.weatherInfo.clone();
        for (Observer observer : observers) {
            observer.update(weatherInfo);
        }
    }

    public void setWeatherInfo(WeatherInfo weatherInfo) {
        this.weatherInfo = weatherInfo;
        notifyObservers();
    }
}
