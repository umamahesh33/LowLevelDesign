package FactoryPattern.ImplWithoutFactory;

public class CoffeeServer {
    private Coffee coffee;
    public Coffee serve(String coffeeType){
        if(coffeeType.equals("cappuccino"))
            this.coffee=new Cappuccino();
        else if(coffeeType.equals("black"))
            this.coffee=new Black();
        else
            this.coffee=new DoubleBlack();
        coffee.brew();
        coffee.boil();
        return this.coffee;
    }
}
