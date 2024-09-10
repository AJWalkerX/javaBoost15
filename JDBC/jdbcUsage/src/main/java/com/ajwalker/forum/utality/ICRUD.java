package com.ajwalker.forum.utality;

import java.util.List;
import java.util.Optional;

public interface ICRUD<T> {
    void save(T t);
    void update(T t);
    void delete(int id);
    List<T> findAll();
    Optional<T> findById(int id);

}
