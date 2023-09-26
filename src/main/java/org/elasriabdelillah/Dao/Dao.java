package org.elasriabdelillah.Dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    T save(T t);
    T update(T t);
    void delete(int id);
    List<T> getAll();
    T getOne(int id);
}
