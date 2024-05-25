package exercise2;

public class MainShop {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart = new ShippingCostDecorator(new DiscountDecorator(new MascotDecorator(new LanyardDecorator(new CupDecorator(new NotebookDecorator(new PenDecorator(cart)))))));

        cart.displayCart();
    }
}
