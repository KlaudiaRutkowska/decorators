package exercise2;

public class PenDecorator extends CartDecorator implements Product {
    public PenDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public String getDescription() {
        return "pen";
    }

    @Override
    public double getPrice() {
        return 4;
    }

    public double getTotalPrice() {
        return super.getTotalPrice() + this.getPrice();
    }

    public void displayCart() {
        super.displayCart();
        System.out.println("Produkt: " + this.getDescription() + " w kwocie " + this.getPrice() + " zł");
    }
}
