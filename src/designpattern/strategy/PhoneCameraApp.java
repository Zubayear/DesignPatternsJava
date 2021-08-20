package designpattern.strategy;

public abstract class PhoneCameraApp {
    ShareAble shareAble;

    public void performShare() {
        shareAble.share();
    }

    public void setShareAble(ShareAble shareAble) {
        this.shareAble = shareAble;
    }

    void take() {
        System.out.println("take a photo");
    }

    abstract void edit();

    void save() {
        System.out.println("Save a photo");
    }
}
