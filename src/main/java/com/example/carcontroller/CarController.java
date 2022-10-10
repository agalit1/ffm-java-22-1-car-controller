package com.example.carcontroller;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/car")
public class CarController {

    private CarService carService = new CarService();

    @PostMapping
    public Car addCar(@RequestBody Car car) {
        carService.addCar(car);
        return car;
    }

    @GetMapping
    public List<Car> getCars() {
        return carService.getCars();
    }
}
