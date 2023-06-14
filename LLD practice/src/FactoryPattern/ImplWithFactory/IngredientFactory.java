package FactoryPattern.ImplWithFactory;

public interface IngredientFactory {
    public Bean getBean();
    public Milk getMilk();
    public Sugar getSugar();
}
