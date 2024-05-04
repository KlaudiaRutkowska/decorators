package exercise2;

public class Cup implements Product {
    @Override
    public String getDescription() {
        return "cup";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
