package exercise2;

abstract class CartDecorator extends Cart {
    protected Cart cart;

    public CartDecorator(Cart cart) {
        this.cart = cart;
    }

    public double getTotalPrice() {
        return cart.getTotalPrice();
    }

    public void displayCart() {
        cart.displayCart();
    }
}
