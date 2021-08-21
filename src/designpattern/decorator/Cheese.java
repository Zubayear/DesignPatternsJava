package designpattern.decorator;

public class Cheese extends PizzaDecorator {
    Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    double cost() {
        return pizza.cost() + .89;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with, Cheese";
    }
}
