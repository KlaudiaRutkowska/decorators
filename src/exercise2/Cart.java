package exercise2;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void displayCart() {
        System.out.println("Zamówione produkty:");
        for (Product product : products) {
            System.out.println("- " + product.getDescription());
        }
        System.out.println("Łączna kwota przed rabatem: " + getTotalPrice() + " zł");
    }
}
