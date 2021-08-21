package designpattern.decorator;

public class ThinCrustPizza extends Pizza{
    public ThinCrustPizza() {
        description = "Thin Crust Pizza";
    }

    @Override
    double cost() {
        return 10.0;
    }
}
