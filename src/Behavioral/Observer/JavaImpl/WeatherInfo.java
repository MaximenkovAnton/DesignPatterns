package Behavioral.Observer.JavaImpl;

class WeatherInfo {
    private String weather;
    private int temperature;
    private int windSpeed;
    private String windDirection;

    WeatherInfo(String weather, int temperature, int windSpeed, String windDirection) {
        this.weather = weather;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
    }

    String getWeather() {
        return weather;
    }

    int getTemperature() {
        return temperature;
    }

    int getWindSpeed() {
        return windSpeed;
    }

    String getWindDirection() {
        return windDirection;
    }
}
