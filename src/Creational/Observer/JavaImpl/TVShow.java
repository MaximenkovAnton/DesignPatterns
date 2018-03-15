package Creational.Observer.JavaImpl;

import java.util.Observable;
import java.util.Observer;

class TVShow implements Observer{
    WeatherInfo info;
    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherForecast){
            WeatherForecast forecast = (WeatherForecast) observable;
            info = forecast.getWeatherInfo();
            showWeather();
        }
    }

    private void showWeather() {
        System.out.println("Tomorrow it will be " + info.getWeather() + ". The temperature will be "
                + info.getTemperature() + ". Wind: " + info.getWindDirection() + " " + info.getWindSpeed() + "m/s." );
    }
}
