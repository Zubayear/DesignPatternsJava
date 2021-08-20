package designpattern.observer;

public class Logger implements Observer {
    private double temp;
    private WeatherStation weatherStation;

    public Logger(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update(double temperature) {
        temp = temperature;
        log();
    }

    public void log() {
        System.out.printf("FROM %s, Temperature: %f\n", this.getClass().getName(), temp);
    }
}
