package com.ajwalker.one_to_one.bi_directional.repository;

import com.ajwalker.one_to_one.bi_directional.entity.Personel;

public class PersonelRepository extends RepositoryManager<Personel, Long> {
    public PersonelRepository() {
        super(Personel.class);
    }
}
