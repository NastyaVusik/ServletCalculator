package SOLID_3;

public class OrderValidator {
    public boolean valid(Order order) {
        System.out.println("Valid!");
        return order != null;
    }
}
