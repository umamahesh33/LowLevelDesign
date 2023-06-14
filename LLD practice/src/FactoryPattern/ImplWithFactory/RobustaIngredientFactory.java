package FactoryPattern.ImplWithFactory;

public class RobustaIngredientFactory implements IngredientFactory {
    @Override
    public Bean getBean() {
        return new FrenchBean();
    }

    @Override
    public Milk getMilk() {
        return new CowMilk();
    }

    @Override
    public Sugar getSugar() {
        return new RegularSugar();
    }
}
