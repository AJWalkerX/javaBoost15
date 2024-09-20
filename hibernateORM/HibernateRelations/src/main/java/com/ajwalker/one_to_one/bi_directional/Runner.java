package com.ajwalker.one_to_one.bi_directional;

import com.ajwalker.one_to_one.bi_directional.entity.Car;
import com.ajwalker.one_to_one.bi_directional.entity.Personel;
import com.ajwalker.one_to_one.bi_directional.repository.CarRepository;
import com.ajwalker.one_to_one.bi_directional.repository.PersonelRepository;

public class Runner {
    public static void main(String[] args) {
        PersonelRepository personelRepositorypository = new PersonelRepository();
        CarRepository carrepository = new CarRepository();

        Personel personel = Personel.builder().name("Ahmet").build();
        Car car = Car.builder().model("Mercedes").personel(personel).build();
        personel.setCar(car);
        carrepository.save(car);
        carrepository.findAll().forEach(System.out::println);
        personelRepositorypository.findAll().forEach(System.out::println);

    }
}
