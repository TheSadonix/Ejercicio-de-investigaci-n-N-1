package Restaurant;

import java.util.Map;

public class Costumer{
    private String name;
    private int age;
    private String phoneNumber;
    private String adress;
    private String chosenDishName;
    private double chosenDishPrice;

    public Costumer(String name, int age, String phoneNumber, String adress){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
    }
    
    public void getData(){
        System.out.println("Información del cliente:\n");
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age + " años");
        System.out.println("Teléfono: " + phoneNumber);
        System.out.println("Domicilio: " + adress);
    }

    public String getName(){
        return name;
    }

    public String getAdress(){
        return adress;
    }

    public String getDishName(){
        return chosenDishName;
    }

    public double getDishPrice(){
        return chosenDishPrice;
    }

    public void orderFood(Restaurant restaurant){
        java.util.List<Map.Entry<String, Double>> menu = restaurant.getMenuItems();
        int randomIndex = new java.util.Random().nextInt(menu.size());
        Map.Entry<String, Double> entry = menu.get(randomIndex);
        this.chosenDishName = entry.getKey();
        this.chosenDishPrice = entry.getValue();
        System.out.println("El cliente " + name + " ha realizado un pedido de " + chosenDishName + ".");
    }
}