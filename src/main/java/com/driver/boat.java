package com.driver;


public class boat {
    private String name;
    private int capacity;

    public boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    public String getVehicleName()
    {
        return name;
    }

    public int getVehicleCapacity()
    {
        return capacity;
    }
}
