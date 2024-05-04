package exercise2;

public class DiscountDecorator extends CartDecorator {
    public DiscountDecorator(Cart cart) {
        super(cart);
    }

    public double getTotalPrice() {
        double totalPrice = super.getTotalPrice();
        totalPrice -= 10;
        return totalPrice < 0 ? 0 : totalPrice;
    }

    public void displayCart() {
        super.displayCart();
        System.out.println("Łączna kwota po rabacie: " + getTotalPrice() + " zł");
    }
}
