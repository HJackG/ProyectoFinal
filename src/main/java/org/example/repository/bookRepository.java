package org.example.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.entity.book;
import org.example.entity.persona;
import org.example.exception.MisExcepciones;
import org.example.repository.impl.CRUD;

import java.awt.print.Book;
import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

public class bookRepository implements CRUD {

    private final String BOOK_PATH = "src/main/java/resources/books.json";

    Gson gson = new Gson();
    public static List<book> listaLibros = new ArrayList<>();


    public bookRepository() {
        listaLibros = new ArrayList<>();
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
    public book read(Object o) {
        if (o instanceof Integer) {
            if ((Integer) o >= listaLibros.size()) {
                return listaLibros.get((Integer) o);
            } else {
                MisExcepciones.libroSinStock();

            }
        }
        return null;
    }

    @Override
    public Object update(Object o) {
        return null;
    }

    @Override
    public void delete(Object o) {

    }

    public void loadLibros() {
        try (Reader reader = new FileReader(BOOK_PATH)) {
            Type userListType = new TypeToken<List<book>>() {
            }.getType();
            listaLibros = gson.fromJson(reader, userListType);
            if (listaLibros == null) {
                listaLibros = new ArrayList<>();
            }
        } catch (
                Exception e) {
            e.printStackTrace();
        }

    }

    public void saveLibros() {
        try (Writer writer = new FileWriter(BOOK_PATH)) {
            gson.toJson(getListaLibros(), writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
