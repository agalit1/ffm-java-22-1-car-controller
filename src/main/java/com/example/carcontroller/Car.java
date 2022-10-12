package com.example.carcontroller;

import java.util.Objects;

public class Car {

    private String manufacturer;
    private int wheels;
    private boolean badge;

    public Car(String manufacturer, int wheels, boolean badge) {
        this.manufacturer = manufacturer;
        this.wheels = wheels;
        this.badge = badge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return wheels == car.wheels && badge == car.badge && Objects.equals(manufacturer, car.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, wheels, badge);
    }
}
