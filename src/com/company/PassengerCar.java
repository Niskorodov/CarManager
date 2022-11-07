package com.company;

public class PassengerCar extends Car {
    public PassengerCar(String name, String model, int yearOfProduction, int price, int doors, String color, int MaxSpeed, double Engine) {
        super(name, model, yearOfProduction, price, doors, color, MaxSpeed, Engine );
    }

   @Override
    public boolean IsReadyToService() {

       if (distanceOnService > 10000) {
           return true;
       }
       return false;

   }
}


