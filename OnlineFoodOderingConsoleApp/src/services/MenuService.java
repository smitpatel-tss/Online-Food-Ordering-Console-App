package services;

import model.CuisineType;
import model.FoodItem;
import model.Menu;
import repositories.MenuRepository;

import java.util.List;

public class MenuService {
    private Menu menu;

    public MenuService() {
        menu = new Menu(MenuRepository.getMenuItemList());
    }

    public void displayMenu() {
        System.out.println("====================MENU====================");
        for (CuisineType cuisine : menu.getMenu().keySet()) {
            List<FoodItem> foodItems = menu.getMenu().get(cuisine);

            System.out.println("-> " + cuisine + ":");
            for (FoodItem items : foodItems) {
                System.out.println(items.getId() + ". " + items.getName() + "          " + items.getPrice());
            }
        }
    }

    public void changeName(int id,String newName){
        getItemFromId(id).setName(newName);
    }

    public void changePrice(int id,double newPrice){
        getItemFromId(id).setPrice(newPrice);
    }

    public FoodItem getItemFromId(int id) {
        for (CuisineType cuisine : menu.getMenu().keySet()) {
            List<FoodItem> foodItems = menu.getMenu().get(cuisine);

            for (FoodItem items : foodItems) {
                if (items.getId() == id) {
                    return items;
                }
            }
        }
    }

}
