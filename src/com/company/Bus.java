package com.company;

public class Bus extends Car {
    public Bus(String name, String model, int yearOfProduction, int price, int doors, String color, int MaxSpeed) {
        super(name, model, yearOfProduction, price, doors, color, MaxSpeed);
    }

   @Override
    public boolean IsReadyToService() {

       if (distanceOnService > 10000) {
           return true;
       }
       return false;

   }
}
