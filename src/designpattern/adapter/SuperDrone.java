package designpattern.adapter;

public class SuperDrone implements Drone{
    @Override
    public void beep() {
        System.out.println("I'm beeping man");
    }

    @Override
    public void spinRotors() {
        System.out.println("Rotors spinning");
    }

    @Override
    public void takeOff() {
        System.out.println("I'm taking off now");
    }
}
