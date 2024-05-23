package exercise1;

public class MainPizza {
    public static void main(String[] args) {
        Pizza hawaiiToppings = new ExtraOlives(new ExtraCheese(new Hawaii()));
        System.out.println("\nDescription: " + hawaiiToppings.getDescription());
        System.out.println("Price: " + hawaiiToppings.getCost());

        Pizza capricciosaToppings = new NoOlives(new Capricciosa());
        System.out.println("\nDescription: " + capricciosaToppings.getDescription());
        System.out.println("Price: " + capricciosaToppings.getCost());

        Pizza pepperoniToppings = new ExtraOlives(new Pepperoni());
        System.out.println("\nDescription: " + pepperoniToppings.getDescription());
        System.out.println("Price: " + pepperoniToppings.getCost());
    }
}