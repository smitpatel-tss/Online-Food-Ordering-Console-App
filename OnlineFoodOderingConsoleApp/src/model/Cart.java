package model;

import java.util.HashMap;

public class Cart {
    private HashMap<FoodItem,Integer> cart;
    private double totalCartPrice;

    public Cart(){
        cart=new HashMap<>();
    }

    public void addItemToCart(FoodItem item,int quantity){
        if(cart.containsKey(item)){
            cart.put(item,cart.get(item)+quantity);
        }else{
            cart.put(item,quantity);
        }
        totalCartPrice+=(item.getPrice()*quantity);
    }

    public void removeItemFromCart(FoodItem item, int quantity){
        if(cart.containsKey(item)){
            cart.put(item,cart.get(item)-quantity);
        }
        if(cart.get(item)<=0){
            cart.remove(item);
        }
        totalCartPrice-=(item.getPrice()*quantity);
    }

    public void displayCart(){
        int i=1;
        for(FoodItem item:cart.keySet()){
            System.out.println((i++)+". "+item.getName()+" (Rs. "+item.getPrice()+") "+cart.get(item));
        }
        System.out.println("------------------------------------------");
        System.out.println("Current Total: Rs."+totalCartPrice);
    }
}
