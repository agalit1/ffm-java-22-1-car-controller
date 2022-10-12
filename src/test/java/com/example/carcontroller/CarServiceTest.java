package com.example.carcontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;


public class CarServiceTest {

    @Test
    public void testWithMockito() {
        //Given

        CarRepository carRepository = mock(CarRepository.class);
        CarService carService = new CarService(carRepository);

        //When
        String id = "2";
        when(carRepository.getCarById(id)).thenReturn(new Car("Volvo", 4, true));
        Car actual = carService.getCarById(id);

        //Then
        assertEquals(new Car("Volvo", 4, true), actual);
    }
}