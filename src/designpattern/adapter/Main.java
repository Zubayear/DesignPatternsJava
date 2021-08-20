package designpattern.adapter;

public class Main {
    public static void main(String[] args) {
        Drone drone = new SuperDrone();
        Duck obj = new DroneAdapter(drone);
        test(obj);
    }

    static void test(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
