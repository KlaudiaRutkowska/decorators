package exercise1;

public class MainPizza {
    public static void main(String[] args) {
        Pizza hawaii = new Hawaii();
        System.out.println("Description: " + hawaii.getDescription());
        System.out.println("Price: " + hawaii.getCost());

        Pizza hawaiiToppings = new ExtraOlives(new ExtraCheese(hawaii));
        System.out.println("\nDescription: " + hawaiiToppings.getDescription());
        System.out.println("Price: " + hawaiiToppings.getCost());

        Pizza capricciosa = new Capricciosa();
        System.out.println("\nDescription: " + capricciosa.getDescription());
        System.out.println("Price: " + capricciosa.getCost());

        Pizza capricciosaToppings = new NoOlives(capricciosa);
        System.out.println("\nDescription: " + capricciosaToppings.getDescription());
        System.out.println("Price: " + capricciosaToppings.getCost());

        Pizza pepperoni = new Pepperoni();
        System.out.println("\nDescription: " + pepperoni.getDescription());
        System.out.println("Price: " + pepperoni.getCost());

        Pizza pepperoniToppings = new ExtraOlives(pepperoni);
        System.out.println("\nDescription: " + pepperoniToppings.getDescription());
        System.out.println("Price: " + pepperoniToppings.getCost());
    }
}