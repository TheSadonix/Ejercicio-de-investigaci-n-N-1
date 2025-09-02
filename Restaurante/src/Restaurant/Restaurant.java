package Restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant{
    private String name;
    private Map<String, Double> menu;

    public Restaurant(String name){
        this.name = name;
        this.menu = new HashMap<>();
    }

    public String getName(){
        return name;
    }

    public void addItemsToMenu(String itemName, double price){
        menu.put(itemName, price);
    }

    public List<Map.Entry<String, Double>> getMenuItems(){
        return new ArrayList<>(menu.entrySet());
    }
}