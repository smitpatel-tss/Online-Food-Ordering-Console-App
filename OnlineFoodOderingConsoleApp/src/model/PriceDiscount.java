package model;

public class PriceDiscount implements Discount{
    private double minimumAmount;
    private double discount;

    public PriceDiscount(double minimumAmount, double discount) {
        this.minimumAmount = minimumAmount;
        this.discount = discount;
    }

    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public boolean checkDiscount(double amount) {
        return amount>=minimumAmount;
    }

    @Override
    public String getDescription() {
        return discount+"% discount on order on or above Rs. "+minimumAmount+".";
    }
}
