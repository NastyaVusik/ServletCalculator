package SOLID_3;

import SOLID_5.EmailSender;
import SOLID_5.OrderService;
import SOLID_5.OrderStorage;

public class Main {
    public static void main(String[] args) {
//        OrderService orderService = new OrderService();

//        orderService.process(new Order());
//        orderService.process(null);


        OrderService orderService = new OrderService(new OrderStorage(), new EmailSender(), new OrderValidator());
        OrderService orderService1 = new OrderService(new OrderStorage(), new EmailSender(), new OrderValidatorWithLogging());
    }
}
