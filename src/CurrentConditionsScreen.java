import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CurrentConditionsScreen implements Observers,ScreenInterface{
    private double temperature;
    private double humidity;
    private WeatherData weatherData;
    public CurrentConditionsScreen(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void update(double temperature, double humidity){
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }
    public void display(){
        System.out.println("Temp--> "+ temperature +"\t"+"Humidity---> "+humidity);
    }

}
