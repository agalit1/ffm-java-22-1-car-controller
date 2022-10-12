package com.example.carcontroller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

//    @PostMapping
//    public Car addCar(@RequestBody Car car) {
//        carService.addCar(id, car);
//        return car;
//    }

    @GetMapping
    public Map<String, Car> getCars() {
        return carService.getCars();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable String id) {
        return carService.getCarById(id);
    }
}
