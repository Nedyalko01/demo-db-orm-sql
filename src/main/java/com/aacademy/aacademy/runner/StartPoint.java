package com.aacademy.aacademy.runner;

import com.aacademy.aacademy.entity.Cars;
import com.aacademy.aacademy.repository.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class StartPoint implements CommandLineRunner {

    @Autowired
    private VehicleRepo vehicleRepo;

    @Autowired
    private VehicleRepo vehicleRepo1;


    @Override
    public void run(String... args) throws Exception {

        Cars car = new Cars();
        car.setModel("Audi");
        car.setColor("Black");
        car.setHorsePower(230);

//        Cars car2 = new Cars();
//        car.setModel("BMW");
//        car.setColor("Silver");
//        car.setHorsePower(245);

        vehicleRepo.save(car);
        //vehicleRepo1.save(car2);


    }
}
