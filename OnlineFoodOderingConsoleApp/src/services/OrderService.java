package services;

import model.*;
import payments.PaymentMode;
import repositories.OrderRepository;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<Order> orders;

    public OrderService(){
        orders= OrderRepository.getAllOrders();
    }

    public void placeOrder(Cart cart, PaymentMode paymentMode, long customerId){

    }

    public List<Order> ordersFromCustomerId(long id){
        List<Order>matchingOrders=new ArrayList<>();

        for(Order order:orders){
            if(order.getCustomerId()==id){
                matchingOrders.add(order);
            }
        }
        return matchingOrders;
    }

    public List<Order> ordersFromDeliveryAgentId(long id){
        List<Order>matchingOrders=new ArrayList<>();

        for(Order order:orders){
            if(order.getDeliveryPartner().getId()==id){
                matchingOrders.add(order);
            }
        }
        return matchingOrders;
    }

    public Order ordersFromOrderId(long id){
        List<Order>matchingOrders=new ArrayList<>();

        for(Order order:orders){
            if(order.getOrderId()==id){
                return order;
            }
        }
        return null;
    }
}
