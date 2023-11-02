package SOLID_3;

public class OrderService {
    private final OrderStorage orderStorage = new OrderStorage();
    private final EmailSender emailSender = new EmailSender();
//    private final OrderValidator orderValidator = new OrderValidator();
    private  final OrderValidator orderValidator = new OrderValidatorWithLogging();

    public void process(Order order){
        if (orderValidator.valid(order) & orderStorage.saveOrder(order)){
            emailSender.sendEmail(order);
        }

    }






}
