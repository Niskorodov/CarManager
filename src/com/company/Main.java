package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Car BMW = new PassengerCar("BMW Performance", "M5", 2021, 3000000, 4, "green", 300, 3.0);
        Car Mercedes = new PassengerCar("Mercedes Benz", "Class E", 2021, 800000, 4, "white", 280, 3.0);
        Car Mercedes2 = new PassengerCar("Mercedes Benz", "Class E", 2021, 800000, 4, "white", 280, 3.0);
        List<Car> cars = new ArrayList<>();
        cars.add(BMW);
        cars.add(Mercedes);
        cars.add(Mercedes2);
        System.out.println(cars);
        BMW.addDistance(100000);
        Mercedes.addDistance(3000);
        System.out.println(BMW);
        System.out.println(Mercedes);
        System.out.println("Equals " + Mercedes2.equals(Mercedes));
        System.out.println("Service " + BMW.IsReadyToService());
        System.out.println("Service " + Mercedes.IsReadyToService());
    }
}
