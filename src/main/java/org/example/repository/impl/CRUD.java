package org.example.repository.impl;

import org.example.entity.administrativo;

public interface CRUD<T> {

    T create();

    T read(T t);

    T update(T t);

    void delete(T t);

}
