package designpattern.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        UserInterface userInterface = new UserInterface(weatherStation);
        Logger logger = new Logger(weatherStation);
        weatherStation.setTemperature(90.8);
    }
}
