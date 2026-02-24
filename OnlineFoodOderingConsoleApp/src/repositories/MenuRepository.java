package repositories;

import model.CuisineType;
import model.FoodItem;

import java.util.HashMap;
import java.util.List;

public class MenuRepository {
    private static HashMap<CuisineType,List<FoodItem>> menu;

    public static HashMap<CuisineType,List<FoodItem>> getMenuItemList(){
        return menu;
    }
}
