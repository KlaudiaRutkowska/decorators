package exercise1;

public class Pepperoni implements Pizza {
    @Override
    public String getDescription() {
        return "Pepperoni";
    }

    @Override
    public double getCost() {
        return 20.9;
    }
}
