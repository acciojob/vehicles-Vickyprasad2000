package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        Vehicle RX100 = new Vehicle("RX100");
        RX100.move(250,720);
        RX100.steer(150);
        RX100.stop();

        Boat pawanDoni = new Boat("pawanDoni", 80);
        System.out.println(pawanDoni.getVehicleName());
        System.out.println(pawanDoni.getVehicleCapacity());
    }
}