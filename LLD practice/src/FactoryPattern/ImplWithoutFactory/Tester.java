package FactoryPattern.ImplWithoutFactory;

public class Tester {
    public static void main(String[] args) {
        CoffeeServer coffeeServer=new CoffeeServer();
        Coffee coffee=coffeeServer.serve("cappuccino");
    }
}
