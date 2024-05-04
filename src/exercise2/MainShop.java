package exercise2;

public class MainShop {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.addProduct(new Cup());
        cart.addProduct(new Notebook());
        cart.addProduct(new Pen());

        cart = new DiscountDecorator(new ShippingCostDecorator(new MascotDecorator(new LanyardDecorator(cart))));

        cart.displayCart();
    }
}
