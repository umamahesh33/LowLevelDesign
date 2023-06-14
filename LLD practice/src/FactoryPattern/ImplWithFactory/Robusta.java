package FactoryPattern.ImplWithFactory;

public class Robusta extends Coffee{
    public Robusta(IngredientFactory ingredientFactory){
        super(ingredientFactory);
    }

    @Override
    public void brew() {

    }

    @Override
    public void boil() {

    }
}

/*
Abstract Factory pattern should be used when you have a common product and its
concrete impl(cappuccino, espresso, robusta) uses some combinations of different
products(Bean milk sugar) as these products comes under a common behaviour called
ingredients, so here IngredientFactory is a abstract factory, where we can implement
its concrete classes as CappuccinoIngredientFactory like this.

cons:
we need to write lot many small classes, but it is better than having if else check in a
single class that if cappuccino send american bean, if we need to change the recipe of
cappuccino then i can directly change the bean type or milk type in the CappuccinoIngredientFactory
class where if coded IngredientFactory as a class i need to handle as if else and for any
recipe change we need to change this class

another impl of this abstract factory pattern is
Cars - Concrete cars
Parts - tyres breaks engine
This can also be coded in a abstract factory pattern PartsFactory is a abstract factory
will have getTyres() getBreaks() getEngine() functions and its concrete classes are like
FerrariPartsFactory, FordPartsFactory, like this.
 */
