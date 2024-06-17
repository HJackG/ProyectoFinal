package org.example.repository;

import org.example.entity.book;
import org.example.repository.impl.CRUD;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class bookRepository implements CRUD {

    public List<book> listaLibros = new ArrayList<>();

    public bookRepository() {
    }

    public bookRepository(List<book> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public List<book> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<book> listaLibros) {
        this.listaLibros = listaLibros;
    }

    @Override
    public Object create() {
        return null;
    }

    @Override
    public Object read(Object o) {

        return listaLibros.get((Integer) o);
    }

    @Override
    public Object update(Object o) {
        return null;
    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public void Register(Object o) {

    }
}
