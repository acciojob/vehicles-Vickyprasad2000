package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 108);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        Boat pawanDoni = new Boat("pawanDoni", 850);
        System.out.println(pawanDoni.getVehicleName());
        System.out.println(pawanDoni.getVehicleCapacity());

    }
}