package org.example;

import org.example.entity.book;
import org.example.menu.menuMain;
import org.example.repository.bookRepository;

import java.io.IOException;

public class Main {
    private static final menuMain menu = new menuMain();

    public static void main(String[] args) throws IOException {

        /////////////////////////////////////////////////////////////////
        ///////////////////////SECTOR PRUEBA
        //////////////////////////////////////////////////////////////////
        book libro = new book("El Naucrato", "Tomas Rebord", "Planeta", "Ciencia Ficcion", "Español", "aslhjasdjahslkashdjkl", 2, 500);
        book libro2 = new book("Maradona", "Tomas Rebord", "Planeta", "Ciencia Ficcion", "Español", "aslhjasdjahslkashdjkl", 5, 200);
        book libro3 = new book("El diegote", "Tomas Rebord", "Planeta", "Ciencia Ficcion", "Español", "aslhjasdjahslkashdjkl", 9, 50);

        bookRepository libroRepo = new bookRepository();

        libroRepo.listaLibros.add(libro);
        libroRepo.listaLibros.add(libro2);
        libroRepo.listaLibros.add(libro3);
        ///////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////




        menu.mainFlow() ;
    }

}