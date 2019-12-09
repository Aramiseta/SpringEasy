package com.example.demo.controller;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CarController {
@Autowired
    private CarRepository carRepository;
@GetMapping("/marka")
    public Iterable<Car> marka(){
    return carRepository.findAll();
}
}
