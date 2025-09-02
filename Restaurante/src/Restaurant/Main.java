package Restaurant;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Restaurant restaurant = new Restaurant("Candilejas");
        System.out.println("Administración de " + restaurant.getName());
        wait_for_key();
        clear_console();

        restaurant.addItemsToMenu("Pizza", 10000);
        restaurant.addItemsToMenu("Empanadas (docena)", 15000);
        restaurant.addItemsToMenu("Hamburguesa", 5000);

        System.out.println("Menú:\n");
        for (Map.Entry<String, Double> item : restaurant.getMenuItems()) {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            System.out.println("- " + item.getKey() + ": $" + decimalFormat.format(item.getValue()));
        }
        wait_for_key();
        clear_console();

        Costumer costumer = new Costumer("Juan Miguel Pérez", 30, "3754 538950", "Almirante Brown 671");
        costumer.getData();
        wait_for_key();
        clear_console();

        Driver driver = new Driver("Carlos Roberto Gómez");
        if (driver.isAvailable()){
            System.out.println("El repartidor " + driver.getName() + " está disponible para realiza la entrega.");
            driver.setAvailability(false);
        } else{
            System.out.println("El repartidor " + driver.getName() + " no está disponible para realizar la entrega.");
            driver.setAvailability(true);
        }
        wait_for_key();
        clear_console();

        costumer.orderFood(restaurant);
        wait_for_key();
        clear_console();

        Order order = new Order(costumer);
        order.takeOrder();
        wait_for_key();
    }

    public static void clear_console(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception error){
            System.out.print("Error al intentar limpiar la consola.");
        }
    }

    public static void wait_for_key(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPulse una tecla para continuar...");
        scanner.nextLine();
    }
}