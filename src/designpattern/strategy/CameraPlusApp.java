package designpattern.strategy;

public class CameraPlusApp extends PhoneCameraApp {
    @Override
    void edit() {
        System.out.println(this.getClass().getName());
    }
}
