package exercise1;

public class NoCheese extends PizzaDecorator {
    public NoCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", no cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() - 9.9;
    }
}
