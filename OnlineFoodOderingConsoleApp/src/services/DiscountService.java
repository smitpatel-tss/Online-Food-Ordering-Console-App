package services;

import model.Discount;
import model.PriceDiscount;

import java.util.ArrayList;
import java.util.List;

public class DiscountService {
    List<Discount> discounts;

    public DiscountService(){
        discounts=new ArrayList<>();
    }

    public void displayDiscounts(){
        for(Discount discount:discounts){
            System.out.println(discount.getDescription());
        }
    }

    public void addNewDiscount(double minimumAmount,double discount){
        discounts.add(new PriceDiscount(minimumAmount,discount));
    }

    public Discount giveMaxPossibleDiscount(double amount){
        double maxPossibleDiscount=0;
        Discount possibleDiscount=null;
        for(Discount discount:discounts){
            if(discount.checkDiscount(amount)){
                if(maxPossibleDiscount<discount.getDiscount()){
                    maxPossibleDiscount=discount.getDiscount();
                    possibleDiscount=discount;
                }
            }
        }
        return possibleDiscount;
    }
}
