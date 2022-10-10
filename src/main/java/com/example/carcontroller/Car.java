package com.example.carcontroller;

public class Car {

    private String manufacturer;
    private int wheels;
    private boolean badge;

    public Car(String manufacturer, int wheels, boolean badge) {
        this.manufacturer = manufacturer;
        this.wheels = wheels;
        this.badge = badge;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isBadge() {
        return badge;
    }

    public void setBadge(boolean badge) {
        this.badge = badge;
    }
}
