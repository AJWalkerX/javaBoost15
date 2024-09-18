package com.ajwalker.utility;

import java.util.List;
import java.util.Optional;

public interface ICRUD <T, ID>{
    T save(T t);
    Iterable<T> saveAll(Iterable<T> entities);
    Boolean deleteByID(ID id);
    Optional<T> findByID(ID id);
    Boolean existsByID(ID id);
    List<T> findAll();
    List<T> findFieldNameAndValue(String fieldName, String value);
    List<T> findByFilledFields(T t);

}
