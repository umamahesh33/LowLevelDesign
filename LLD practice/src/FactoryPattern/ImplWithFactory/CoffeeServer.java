package FactoryPattern.ImplWithFactory;

public class CoffeeServer{
    private Coffee coffee;

    public Coffee serve(Coffee coffee){
        this.coffee=coffee;
        coffee.boil();
        coffee.brew();
        return coffee;
    }
}
