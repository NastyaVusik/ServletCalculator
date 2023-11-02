package SOLID_5;

import SOLID_3.Order;

public class OrderStorage implements Storage<Order>{

    public boolean save(Order order){
        System.out.println("Save!");
        return false;
    }
}
