package exercise1;

public class NoOlives extends PizzaDecorator {
    public NoOlives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", no olives";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() - 2.8;
    }
}
