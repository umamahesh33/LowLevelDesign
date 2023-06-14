package FactoryPattern.ImplWithFactory;

public class EspressoIngredientFactory implements IngredientFactory {
    @Override
    public Bean getBean() {
        return new FrenchBean();
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
