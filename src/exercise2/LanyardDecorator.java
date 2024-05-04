package exercise2;

public class LanyardDecorator extends CartDecorator {
    public LanyardDecorator(Cart cart) {
        super(cart);
    }

    public double getTotalPrice() {
        double totalPrice = super.getTotalPrice();
        totalPrice += 1;
        return totalPrice;
    }

    public void displayCart() {
        super.displayCart();
        System.out.println("Dodatek smycz do pendrive 1zł");
    }
}
