package org.example.controller;

import java.awt.print.Book;
import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

import org.example.entity.administrativo;
import org.example.entity.book;
import org.example.entity.cliente;
import org.example.entity.persona;
import org.example.exception.MisExcepciones;
import org.example.menu.menuMain;
import org.example.repository.Config;
import org.example.repository.bookRepository;
import org.example.repository.configRepository;
import org.example.repository.userRepository;

import static org.example.menu.menuMain.requestSpeciliatydMessage;

public class userController {

    private final bookController bookcontroller = new bookController();
    private final bookRepository bookrepository = new bookRepository();
    private final userRepository user_Repository = new userRepository();
    private static final Config config = configRepository.loadConfig();
    Scanner scanner = new Scanner(System.in);

    public void inicio(cliente user) {
        boolean exit = false;
        for (int i = 0; i < bookrepository.listaLibros.size() && !exit; i++)
        {
            book libro= (book) bookrepository.read(i);
            System.out.println(libro);

            System.out.println("01. Solicitar.");
            System.out.println("02. Agregar a Favoritos");
            System.out.println("03. Siguiente.");
            System.out.println("04. Salir..");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion)
            {
                case 1 -> addBook(user,i, libro);
                case 2 -> user.getListFavBook().add(bookrepository.listaLibros.get(i));
                case 3 -> {}
                case 4 -> exit = true;
                default -> System.out.println("Opción invalida");
            }

        }
    }

    public void addBook (cliente user , Integer i, book libro)
    {
        if(bookcontroller.checkStock(libro))
        {
            user.getCurrentlyBorrowedBook().add(bookrepository.listaLibros.get(i));
        }
    }

    public void createPersona(String dni, String name, String lastName, Integer age, String email, String phone, String adress, String password) throws IOException {

        boolean check = user_Repository.dniCheck(dni);
        if (check) {
            if (config.getAdminPassword().equals(password)) {
                System.out.println(menuMain.admMessage);
                System.out.println(menuMain.requestPassswordMessage);
                password = scanner.nextLine();
                System.out.println(menuMain.requestDepartamentMessage);
                String departament = scanner.nextLine();
                System.out.println(requestSpeciliatydMessage);
                String speciliaty = scanner.nextLine();

                user_Repository.Register(new administrativo(dni, name, lastName, age, email, phone, adress, password, true, departament, speciliaty));
            } else {
                user_Repository.Register(new cliente(dni, name, lastName, age, email, phone, adress, password, false));
            }
        } else {
            MisExcepciones.dniExistente();
        }


    }

    public Optional<persona> login(String dni, String password) {

        ///si la llamada a findUser devuelve null, "ofNullable" lo encapsula como un "optional" y lo verificamos en el primer if.
        ///Optional es una clase que utiliza genericos y verifica si tiene o no un valor dentro. Evitando el "NullPointerException".
        Optional<persona> requestedUser = Optional.ofNullable(user_Repository.findUser(dni));

        if (requestedUser.isEmpty()) {
            System.out.println("Usuario no existe");
            return null;
        }

        if (requestedUser.get().getPassword().equals(password)) {
            System.out.println("Logueado exitosamente");
            return requestedUser;
        } else {
            System.out.println("Contraseña incorrecta");
            return null;
        }
    }


    public void logOut() {

    }

    public void requestBook(Book book) {

    }

    public void returnBook(Book book) {

    }
}
