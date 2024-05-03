package exercise1;

public class Capricciosa implements Pizza {
    @Override
    public String getDescription() {
        return "Capricciosa";
    }

    @Override
    public double getCost() {
        return 26;
    }
}
