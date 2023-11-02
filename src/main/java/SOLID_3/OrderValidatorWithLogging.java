package SOLID_3;

public class OrderValidatorWithLogging extends OrderValidator{
    @Override
    public boolean valid(Order order) {
        boolean result = super.valid(order);
        System.out.println("Logging "+ result + ", " + order);
return result;
    }
}
