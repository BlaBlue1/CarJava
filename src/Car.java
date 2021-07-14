public class Car {
    //private member variables
    private String brand, color;
    private int speed;

    private Driver driver;
    public void setDriver(Driver driver){
        this.driver = driver;

    }
    public Driver getDriver() {
        return this.driver;
    }

    //default constructor
    public Car() {

    }//getters and setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return this.brand;

    }public void setColor(String color){
        this.color = color;

    }public String getColor(){
        return this.color;

    }public void setSpeed(int speed){
        this.speed = speed;

    }public int getSpeed(){
        return this.speed;
    }

    //overload constructor
    public Car(String brand, String color, int speed ){
        this.brand = brand;
        this.color = color;
        this.speed = speed;


        System.out.println("The " + getColor() + getBrand() + " is starting");


    }//create method which return a string
    //indicating each task the car is performing
    /*
    public void showDriver(){
        String driver = 
     */










}
