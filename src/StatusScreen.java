import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class StatusScreen implements Observers,ScreenInterface{
    private double temp;
    private WeatherData weatherData;
    private String status;
    StatusScreen(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.addObserver(this);
    }

    public void update(double temperature, double humidity) {
        this.temp=temperature;
        checkStatus();
        display();
    }
    void checkStatus(){
        if(this.temp>29){
            this.status="The weather is hot";
        }
        if(this.temp<19){
            this.status="The weather is Cold";
        }
    }
    String getStatus(){return this.status;}
    public void display() {
        System.out.println(getStatus());
    }
}
