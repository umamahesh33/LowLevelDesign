package FactoryPattern.ImplWithFactory;

public class Tester{
    public static void main(String[] args) {
        CoffeeServer coffeeServer=new CoffeeServer();
        CoffeeFactory coffeeFactory=new CoffeeFactory();
        coffeeServer.serve(coffeeFactory.getCoffee("Espresso"));
    }
}
