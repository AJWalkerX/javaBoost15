package com.ajwalker.repository;

import com.ajwalker.utility.ICRUD;

import java.util.List;
import java.util.Optional;

public class RepositoryManager <T, ID> implements ICRUD {
    @Override
    public Object save(Object o) {
        return null;
    }

    @Override
    public Iterable saveAll(Iterable entities) {
        return null;
    }

    @Override
    public Boolean deleteByID(Object o) {
        return null;
    }

    @Override
    public Optional findByID(Object o) {
        return Optional.empty();
    }

    @Override
    public Boolean existsByID(Object o) {
        return null;
    }

    @Override
    public List findAll() {
        return List.of();
    }

    @Override
    public List findFieldNameAndValue(String fieldName, String value) {
        return List.of();
    }

    @Override
    public List findByFilledFields(Object o) {
        return List.of();
    }
}
