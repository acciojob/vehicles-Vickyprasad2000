package com.driver;

import java.sql.SQLOutput;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name,4,0,6,isManual,"race",1);
    }
    public boolean isManual()
    {
        return isManual();
    }
    public int getCurretntGear()
    {
        return getCurretntGear();
    }


    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate; //set the value of new speed by using currentSpeed and rate
        /*
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed <= 0)
        {
            stop();
            changeGear(1);
        }
        //for all other cases, change the gear accordingly


        if(newSpeed > 0) {
            changeGear((newSpeed >=1 && newSpeed <= 50) ? 1 : (newSpeed >=51 && newSpeed <= 100) ? 2 : (newSpeed >=101 && newSpeed <= 150) ? 3 : (newSpeed >=151 && newSpeed <= 200) ? 4 : (newSpeed >=201 && newSpeed <= 250) ? 5 : 6);
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
