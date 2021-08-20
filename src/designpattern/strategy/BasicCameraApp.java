package designpattern.strategy;

public class BasicCameraApp extends PhoneCameraApp {
    @Override
    void edit() {
        System.out.println(this.getClass().getName());
    }

    public BasicCameraApp() {
        shareAble = new SocialMediaShare();
    }
}
