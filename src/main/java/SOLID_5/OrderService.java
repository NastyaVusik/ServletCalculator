package SOLID_5;

import SOLID_3.Order;
import SOLID_3.OrderStorage;
import SOLID_3.*;

public class OrderService {
    private final Storage<Order> orderStorage;
    private final Sender emailSender;
//    private final OrderValidator orderValidator;
    private final OrderValidator orderValidator;


    public OrderService(Storage<Order> orderStorage, Sender emailSender, OrderValidator orderValidator) {
        this.orderStorage = orderStorage;
        this.emailSender = emailSender;
        this.orderValidator = orderValidator;
    }

    public void process(Order order){
        if (orderValidator.valid(order) & orderStorage.save(order)){
            emailSender.send(order.toString());
        }

    }








}
