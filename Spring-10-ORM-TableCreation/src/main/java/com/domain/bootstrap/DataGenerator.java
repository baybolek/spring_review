package com.domain.bootstrap;

import com.domain.entity.Car;
import com.domain.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataGenerator implements CommandLineRunner {

    CarRepository carRepository;

    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Car c1=new Car("BMW", "M5");
        Car c2=new Car("Tesla", "Model X");
        Car c3=new Car("Lexus", "GX");

        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);
    }
}
