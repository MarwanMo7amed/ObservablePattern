import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class WeatherData implements Station{
    private List<Observers> observers;
    private double temperature;
    private double humidity;
    Logger logger=Logger.getLogger("weatherLogs");

    public WeatherData() {
        observers = new ArrayList<Observers>();
    }

    public void addObserver(Observers o) {
        observers.add(o);
    }

    public void removeObservable(Observers o) {
        observers.remove(o);
    }

    public void notifyObserverss() {
        for (Observers observer : observers) {
            observer.update(temperature, humidity);
        }
    }
    public void ChangeWeather(double temperature,double humidity){
        this.temperature=temperature;
        this.humidity=humidity;
        notifyObserverss();
    }
    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

}
