package com.company;

import java.util.Objects;

public abstract class Car implements Serviceable {

    public String name;
    public String model;
    public int yearOfProduction;
    public int price;
    public int doors;
    public String color;
    public int MaxSpeed;
    public double Engine;
    public double codeEngine;
    public double volumeEngine;

    private double distance = 0;
    protected int distanceOnService = 0;

    public Car(String name, String model, int doors, int maxSpeed, double engine, double codeEngine, double volumeEngine, double distance, int distanceOnService) {
        this.name = name;
        this.model = model;
        this.doors = doors;
        MaxSpeed = maxSpeed;
        Engine = engine;
        this.codeEngine = codeEngine;
        this.volumeEngine = volumeEngine;
        this.distance = distance;
        this.distanceOnService = distanceOnService;
    }

    public Car(String name, String model, int yearOfProduction, int price, int doors, String color, int maxSpeed) {
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", doors=" + doors +
                ", MaxSpeed=" + MaxSpeed +
                ", Engine=" + Engine +
                ", codeEngine=" + codeEngine +
                ", volumeEngine=" + volumeEngine +
                ", distance=" + distance +
                ", distanceOnService=" + distanceOnService +
                '}';
    }

    public Car(String name, String model, int yearOfProduction, int price, int doors, String color, int maxSpeed, double engine) {

    }

    public void addDistance(int additionalDistance) {
        distance += additionalDistance;
        distanceOnService += additionalDistance;

    }

   public int getDistanceOnService() {
        return distanceOnService;
    }

    public void setDistanceOnService(int distanceOnService) {
        this.distanceOnService = distanceOnService;
    }

    public void addDistance(double additionalDistance) {
        distance += additionalDistance;
        distanceOnService += additionalDistance;

    }

    public int getDistance() {
        return (int) distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && price == car.price && doors == car.doors && MaxSpeed == car.MaxSpeed && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, yearOfProduction, price, doors, color, MaxSpeed);
    }

}
