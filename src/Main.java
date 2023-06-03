public class Main {
    public static void main(String[] args) {
        WeatherData weatherData= new WeatherData();
        CurrentConditionsScreen currentConditionsScreen= new CurrentConditionsScreen(weatherData);
        StatusScreen statusScreen= new StatusScreen(weatherData);
        weatherData.ChangeWeather(30,10);
        weatherData.ChangeWeather(10,10);
    }
}