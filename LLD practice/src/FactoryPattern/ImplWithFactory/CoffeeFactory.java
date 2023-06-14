package FactoryPattern.ImplWithFactory;

public class CoffeeFactory {

    public Coffee getCoffee(String coffeeType){
        Coffee coffee;
        if(coffeeType.equals("cappuccino"))
            coffee=new Cappuccino(new CappuccinoIngredientFactory());
        else if(coffeeType.equals("Espresso"))
            coffee=new Espresso(new EspressoIngredientFactory());
        else
            coffee=new Robusta(new RobustaIngredientFactory());
        return coffee;
    }
}

