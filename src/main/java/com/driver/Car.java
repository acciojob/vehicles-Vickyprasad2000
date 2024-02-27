package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;


    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
    }
    public int getWheels()
    {
        return wheels;
    }
    public int getDoors()
    {
        return doors;
    }
    public int getGears()
    {
        return gears;
    }
    public boolean getIsManual() { return isManual; }
    public String getType()
    {
        return type;
    }
    public int getSeats()
    {
        return seats;
    }
    public int getCurrentDirection()
    {
        return super.getCurrentDirection();
    }

    public void changeGear(int newGear){

        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

}
