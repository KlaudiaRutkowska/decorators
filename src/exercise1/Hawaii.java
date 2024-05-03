package exercise1;

public class Hawaii implements Pizza {
    @Override
    public String getDescription() {
        return "Hawaii";
    }

    @Override
    public double getCost() {
        return 19.99;
    }
}
