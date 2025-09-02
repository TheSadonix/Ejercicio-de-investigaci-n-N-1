package Restaurant;

import java.text.DecimalFormat;

public class Order {
    private String dish;
    private String costumer;
    private String costumerAdress;
    private double price;

    public Order(Costumer costumer){
        this.dish = costumer.getDishName();
        this.costumer = costumer.getName();
        this.costumerAdress = costumer.getAdress();
        this.price = costumer.getDishPrice();
    }

    public void takeOrder(){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("El pedido de " + dish + " del cliente " + costumer + " ha sido tomado, por un precio total de $" + decimalFormat.format(price) + ", y será enviado a " + costumerAdress + ".");
    }
}