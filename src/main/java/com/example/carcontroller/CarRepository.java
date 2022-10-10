package com.example.carcontroller;

import java.util.ArrayList;
import java.util.List;


public class CarRepository {

    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return this.cars;
    }

    public void addCarToCars(Car car) {
        this.cars.add(car);
    }
}
