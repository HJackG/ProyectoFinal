package org.example.entity;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class cliente extends persona {

    private ArrayList<Book> currentlyBorrowedBook;
    private Map<Integer, Book> returnHistory;

    public cliente(String dni, String name, String lastName, Integer age, String email, String phone, String adress, String password, boolean rol) {
        super(dni, name, lastName, age, email, phone, adress, password, rol);
        this.currentlyBorrowedBook = new ArrayList<>();
        this.returnHistory = new HashMap();
    }

    public cliente() {
    }
}
