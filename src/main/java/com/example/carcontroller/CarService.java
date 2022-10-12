package com.example.carcontroller;

import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class CarService {
    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void addCar(String id, Car car) {
        carRepository.addCarToCars(id, car);
    }

    public Map<String, Car> getCars() {
        return carRepository.getCars();
    }

    public Car getCarById(String id) {
        return carRepository.getCarById(id);
    }
}
