package org.example.controller;

import org.example.entity.Book;
import org.example.exception.MisExcepciones;
import org.example.repository.BookRepository;
import org.example.view.BookView;

import java.util.List;


public class BookController {

    BookRepository bookRepository = new BookRepository();
    BookView bookView = new BookView();

    public void viewBook(Book book){

        BookView.viewBook(book);

    }

    public void viewBooks(List<Book> books){

        BookView.viewBooks(books);

    }

    public boolean checkStock(Book Book)
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
