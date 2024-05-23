package exercise2;

public class CupDecorator extends CartDecorator implements Product {
    public CupDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public String getDescription() {
        return "cup";
    }

    @Override
    public double getPrice() {
        return 10;
    }

    public double getTotalPrice() {
        return super.getTotalPrice() + this.getPrice();
    }

    public void displayCart() {
        super.displayCart();
        System.out.println("Produkt: " + this.getDescription() + " w kwocie " + this.getPrice() + " zł");
    }
}
