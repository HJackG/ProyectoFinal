package org.example.entity;

import java.awt.print.Book;
import java.util.*;

public class cliente extends persona {

    private ArrayList<book> currentlyBorrowedBook;
    private Map<Integer, book> returnHistory;
    private Set<book> listFavBook;

    public cliente(String dni, String name, String lastName, Integer age, String email, String phone, String adress, String password, boolean rol) {
        super(dni, name, lastName, age, email, phone, adress, password, rol);
        this.currentlyBorrowedBook = new ArrayList<>();
        this.returnHistory = new HashMap();
        this.listFavBook = new HashSet<>();
    }

    public cliente() {
    }

    public ArrayList<book> getCurrentlyBorrowedBook() {
        return currentlyBorrowedBook;
    }

    public void setCurrentlyBorrowedBook(ArrayList<book> currentlyBorrowedBook) {
        this.currentlyBorrowedBook = currentlyBorrowedBook;
    }

    public Map<Integer, book> getReturnHistory() {
        return returnHistory;
    }

    public void setReturnHistory(Map<Integer, book> returnHistory) {
        this.returnHistory = returnHistory;
    }

    public Set<book> getListFavBook() {
        return listFavBook;
    }

    public void setListFavBook(Set<book> listFavBook) {
        this.listFavBook = listFavBook;
    }
}
