package designpattern.observer;

public class UserInterface implements Observer {
    private double temperature;
    private WeatherStation weatherStation;

    public UserInterface(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.addObserver(this);
    }

    @Override
    public void update(double temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.printf("FROM: %s, Temperature %f\n", this.getClass().getName(), temperature);
    }
}
