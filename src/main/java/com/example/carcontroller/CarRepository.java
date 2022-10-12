package com.example.carcontroller;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CarRepository {

    private Map<String, Car> cars = new HashMap<>(Map.of(
            "1", new Car("Volvo", 4, true),
            "2", new Car("BMW", 4, false),
            "3", new Car("Seat", 4, true)
    ));

    public Map<String, Car> getCars() {
        return this.cars;
    }

    public void addCarToCars(String id, Car car) {
        this.cars.put(id, car);
    }

    public Car getCarById(String id) {
        Car car = this.cars.get(id);
        if (car == null) {
            throw new NoSuchElementException("No car with id " + id + " found.");
        }
        return car;
    }
}
