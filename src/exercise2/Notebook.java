package exercise2;

public class Notebook implements Product {
    @Override
    public String getDescription() {
        return "notebook";
    }

    @Override
    public double getPrice() {
        return 8;
    }
}
