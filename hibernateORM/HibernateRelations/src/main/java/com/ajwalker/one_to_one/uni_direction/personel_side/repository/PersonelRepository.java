package com.ajwalker.one_to_one.uni_direction.personel_side.repository;

import com.ajwalker.one_to_one.uni_direction.personel_side.entity.Personel;

public class PersonelRepository extends RepositoryManager<Personel, Long> {
    public PersonelRepository() {
        super(Personel.class);
    }
}
