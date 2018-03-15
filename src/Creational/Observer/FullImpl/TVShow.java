package Creational.Observer.FullImpl;

class TVShow extends Observer {
    @Override
    void update(Info f) {
        WeatherInfo info = (WeatherInfo) f;
        showWeather(info);
    }

    private void showWeather(WeatherInfo info) {
        System.out.println("Tomorrow it will be " + info.getWeather() + ". The temperature will be "
                + info.getTemperature() + ". Wind: " + info.getWindDirection() + " " + info.getWindSpeed() + "m/s." );
    }

}
