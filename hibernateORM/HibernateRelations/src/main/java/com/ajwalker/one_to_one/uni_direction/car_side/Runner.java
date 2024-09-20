package com.ajwalker.one_to_one.uni_direction.car_side;

import com.ajwalker.one_to_one.uni_direction.car_side.entity.Car;
import com.ajwalker.one_to_one.uni_direction.car_side.entity.Personel;
import com.ajwalker.one_to_one.uni_direction.car_side.repository.CarRepository;
import com.ajwalker.one_to_one.uni_direction.car_side.repository.PersonelRepository;

public class Runner {
    public static void main(String[] args) {
        PersonelRepository personelRepositorypository = new PersonelRepository();
        CarRepository carrepository = new CarRepository();

        Personel personel = Personel.builder().name("Ahmet").build();
        Car car = Car.builder().model("Mercedes").personel(personel).build();
        personelRepositorypository.save(personel);
        carrepository.save(car);
        carrepository.findAll().forEach(System.out::println);

    }
}
