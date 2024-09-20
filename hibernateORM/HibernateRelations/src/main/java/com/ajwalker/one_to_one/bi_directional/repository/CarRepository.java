package com.ajwalker.one_to_one.bi_directional.repository;

import com.ajwalker.one_to_one.bi_directional.entity.Car;

public class CarRepository extends RepositoryManager<Car,Long> {
    public CarRepository() {
        super(Car.class);
    }
}
