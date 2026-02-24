package model;

import payments.PaymentMode;

public class Order {
    private long orderId;
    private static long count=1;
    private Cart cart;
    private DeliveryPartner deliveryPartner;
    private Discount possibleDiscount;
    private PaymentMode paymentMode;
    private long customerId;
    private OrderStatus status;
    private double finalAmount;

    public Order(Cart cart, DeliveryPartner deliveryPartner, Discount possibleDiscount, PaymentMode paymentMode, long customerId, OrderStatus status) {
        this.orderId=count++;
        this.cart = cart;
        this.deliveryPartner = deliveryPartner;
        this.possibleDiscount = possibleDiscount;
        this.paymentMode = paymentMode;
        this.customerId = customerId;
        this.status = status;
        if(possibleDiscount!=null){
            this.finalAmount=(paymentMode.getAmount()-(paymentMode.getAmount()*possibleDiscount.getDiscount()));
        }else{
            this.finalAmount=paymentMode.getAmount();
        }
    }

    public long getOrderId() {
        return orderId;
    }

    public Cart getCart() {
        return cart;
    }

    public DeliveryPartner getDeliveryPartner() {
        return deliveryPartner;
    }

    public Discount getPossibleDiscount() {
        return possibleDiscount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public long getCustomerId() {
        return customerId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public double getFinalAmount() {
        return finalAmount;
    }
}
