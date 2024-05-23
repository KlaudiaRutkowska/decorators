package exercise2;

public class NotebookDecorator extends CartDecorator implements Product {
    public NotebookDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public String getDescription() {
        return "notebook";
    }

    @Override
    public double getPrice() {
        return 8;
    }

    public double getTotalPrice() {
        return super.getTotalPrice() + this.getPrice();
    }

    public void displayCart() {
        super.displayCart();
        System.out.println("Produkt: " + this.getDescription() + " w kwocie " + this.getPrice() + " zł");
    }
}
