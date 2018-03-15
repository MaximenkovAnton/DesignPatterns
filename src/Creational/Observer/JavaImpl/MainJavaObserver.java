package Creational.Observer.JavaImpl;

public class MainJavaObserver {
    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast();
        TVShow tvShow = new TVShow();
        weatherForecast.addObserver(tvShow);
        weatherForecast.setWeatherInfo(new
                WeatherInfo("Sunny", 20, 5, "North"));
    }
}
