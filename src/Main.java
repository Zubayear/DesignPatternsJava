import designpattern.strategy.BasicCameraApp;
import designpattern.strategy.PhoneCameraApp;

public class Main {
    public static void main(String[] args) {
        PhoneCameraApp phoneCameraApp = new BasicCameraApp();
        phoneCameraApp.performShare();
    }
}
