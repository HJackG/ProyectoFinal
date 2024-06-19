package org.example.controller;

import org.example.entity.book;
import org.example.exception.MisExcepciones;
import org.example.repository.bookRepository;


public class bookController {

    bookRepository bookRep = new bookRepository();

    public boolean checkStock(book Book)
    {
        if (Book.getStock() > 0)
        {
            return true;
        }
        else
        {
            MisExcepciones.libroSinStock();
        }
        return false;
    }
}
