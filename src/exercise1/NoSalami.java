package exercise1;

public class NoSalami extends PizzaDecorator {
    public NoSalami(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", no salami";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() - 5.9;
    }
}
