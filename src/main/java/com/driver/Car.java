package com.driver;

public class Car extends Vehicle {
    private final int wheels;
    private final String type;
    private final int doors;
    private final int gears;
    private final boolean isManual;
    private int currentGear;
    private final int seats;


    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;

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
    public boolean isManual() { return isManual; }
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
    public int getCurrentGear() { return currentGear; }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

}
