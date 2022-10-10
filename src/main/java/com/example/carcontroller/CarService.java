package com.example.carcontroller;

import java.util.List;

public class CarService {
    private CarRepository carRepository = new CarRepository();

    public void addCar(Car car) {
        carRepository.addCarToCars(car);
    }

    public List<Car> getCars() {
        return carRepository.getCars();
    }
}
