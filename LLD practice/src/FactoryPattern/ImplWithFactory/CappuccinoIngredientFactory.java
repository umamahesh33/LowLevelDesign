package FactoryPattern.ImplWithFactory;

public class CappuccinoIngredientFactory implements IngredientFactory {
    @Override
    public Bean getBean() {
        return new AmericanBean();
    }

    @Override
    public Milk getMilk() {
        return new PowderedMilk();
    }

    @Override
    public Sugar getSugar() {
        return new BrownSugar();
    }
}
