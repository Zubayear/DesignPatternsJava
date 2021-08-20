package designpattern.strategy;

public class SocialMediaShare implements ShareAble{
    @Override
    public void share() {
        System.out.println("Share on social media!");
    }
}
