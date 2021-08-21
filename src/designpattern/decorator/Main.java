package designpattern.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new ThinCrustPizza();
        pizza = new Cheese(pizza);
        System.out.println("Pizza description: " + pizza.getDescription());
        System.out.println("Total cost: " + pizza.cost());
    }
}
