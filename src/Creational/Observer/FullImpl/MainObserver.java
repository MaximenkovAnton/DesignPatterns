package Creational.Observer.FullImpl;

public class MainObserver {
    public static void main(String[] args) {
        TVShow tv = new TVShow();
        WeatherForecast forecast = new WeatherForecast();
        forecast.registerObserver(tv);
        forecast.setWeatherInfo(new WeatherInfo("Sunny", 20, 5, "North"));
    }
}
