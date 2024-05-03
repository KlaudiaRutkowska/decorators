package exercise1;

public class ExtraCheese extends PizzaDecorator {
    public ExtraCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Extra cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 9.9;
    }
}
