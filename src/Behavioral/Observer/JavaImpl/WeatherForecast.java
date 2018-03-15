package Behavioral.Observer.JavaImpl;

import java.util.Observable;

class WeatherForecast extends Observable{
    private WeatherInfo weatherInfo;

    void setWeatherInfo(WeatherInfo weatherInfo) {
        this.weatherInfo = weatherInfo;
        setChanged();
        notifyObservers();
    }

    WeatherInfo getWeatherInfo() {
        return weatherInfo;
    }
}
