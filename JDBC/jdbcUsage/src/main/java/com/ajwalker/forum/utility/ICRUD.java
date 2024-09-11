package com.ajwalker.forum.utility;

import java.util.List;
import java.util.Optional;

public interface ICRUD<T> {
    boolean save(T t);
    boolean update(T t);
    boolean delete(int id);
    List<T> findAll();
    Optional<T> findById(int id);

}
