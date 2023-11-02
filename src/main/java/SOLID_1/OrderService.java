package SOLID_1;

public class OrderService {
    private final OrderStorage orderStorage = new OrderStorage();
    private final EmailSender emailSender = new EmailSender();

    public void process(Order order){
        if (orderStorage.saveOrder(order)){
            emailSender.sendEmail(order);
        }

    }






}
