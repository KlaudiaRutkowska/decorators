package exercise2;

public class MascotDecorator extends CartDecorator {
    public MascotDecorator(Cart cart) {
        super(cart);
    }

    public void displayCart() {
        super.displayCart();
        System.out.println("Dodatek maskotka sklepu 0zł");
    }
}
