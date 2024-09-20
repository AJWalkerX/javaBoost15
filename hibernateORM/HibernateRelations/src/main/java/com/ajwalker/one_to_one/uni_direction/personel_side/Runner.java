package com.ajwalker.one_to_one.uni_direction.personel_side;

import com.ajwalker.one_to_one.uni_direction.personel_side.entity.Car;
import com.ajwalker.one_to_one.uni_direction.personel_side.entity.Personel;
import com.ajwalker.one_to_one.uni_direction.personel_side.repository.CarRepository;
import com.ajwalker.one_to_one.uni_direction.personel_side.repository.PersonelRepository;

public class Runner {
    public static void main(String[] args) {
        PersonelRepository personelRepositorypository = new PersonelRepository();
        CarRepository carrepository = new CarRepository();

        Car car = Car.builder().model("Mercedes").build();
        Personel personel = Personel.builder().name("Ahmet").car(car).build();
        carrepository.save(car);
        personelRepositorypository.save(personel);
        personelRepositorypository.findAll().forEach(System.out::println);

    }
}
