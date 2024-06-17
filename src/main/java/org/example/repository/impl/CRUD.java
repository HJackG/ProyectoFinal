package org.example.repository.impl;

public interface CRUD<T> {

    T create();

    T read(T t);

    T update(T t);

    void delete(T t);

    void Register(T t);
}
