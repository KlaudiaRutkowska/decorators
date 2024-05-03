package exercise1;

public class ExtraSalami extends PizzaDecorator {
    public ExtraSalami(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Extra salami";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 5.9;
    }
}
