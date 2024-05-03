package exercise1;

public class ExtraOlives extends PizzaDecorator {
    public ExtraOlives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Extra olives";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 2.8;
    }
}
