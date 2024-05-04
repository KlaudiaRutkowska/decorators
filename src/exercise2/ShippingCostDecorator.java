package exercise2;

public class ShippingCostDecorator extends CartDecorator {
    public ShippingCostDecorator(Cart cart) {
        super(cart);
    }

    public double getTotalPrice() {
        double totalPrice = super.getTotalPrice();
        totalPrice += 13;
        return totalPrice;
    }

    public void displayCart() {
        super.displayCart();
        System.out.println("Dodatkowy koszt transportu 13zł");
    }
}
