package model;

public class FoodItemInitiator {
    static long count=1;

    public FoodItem getFoodItemInstance(String name,Double price,CuisineType cuisine){
        return new FoodItem(count++,name,price,cuisine);
    }
}
