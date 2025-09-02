package Restaurant;

public class Driver{
    private String name;
    private boolean available;

    public Driver(String name){
        this.name = name;
        this.available = true;
    }

    public void setAvailability(boolean available){
        this.available = available;
    }

    public String getName(){
        return name;
    }

    public boolean isAvailable(){
        return available;
    }
}