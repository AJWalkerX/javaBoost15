package com.ajwalker.one_to_one.uni_direction.personel_side.repository;

import com.ajwalker.one_to_one.uni_direction.personel_side.entity.Car;

public class CarRepository extends RepositoryManager<Car,Long>{
    public CarRepository() {
        super(Car.class);
    }
}
