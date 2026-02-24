package repositories;

import model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private static List<Order> allOrders=new ArrayList<>();

    public static List<Order> getAllOrders(){
        return allOrders;
    }
}
