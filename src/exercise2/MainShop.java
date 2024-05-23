package exercise2;

public class MainShop {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart = new DiscountDecorator(new ShippingCostDecorator(new MascotDecorator(new LanyardDecorator(new CupDecorator(new NotebookDecorator(new PenDecorator(cart)))))));

        cart.displayCart();
    }
}
