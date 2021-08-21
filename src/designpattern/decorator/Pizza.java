package designpattern.decorator;

public abstract class Pizza {
    String description = "Classic Pizza";

    public String getDescription() {
        return description;
    }

    abstract double cost();
}
