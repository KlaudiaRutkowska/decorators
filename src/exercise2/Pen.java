package exercise2;

public class Pen implements Product {
    @Override
    public String getDescription() {
        return "pen";
    }

    @Override
    public double getPrice() {
        return 4;
    }
}
