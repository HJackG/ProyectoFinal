package org.example.repository.impl;

import org.example.entity.cliente;

public interface Logueo<T> {
    void Register(T t);

    T findUser(T t);


}
