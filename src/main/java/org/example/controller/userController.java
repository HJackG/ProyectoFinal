package org.example.controller;

import java.awt.print.Book;
import java.io.IOException;
import java.util.*;

import org.example.entity.administrativo;
import org.example.entity.book;
import org.example.entity.cliente;
import org.example.exception.MisExcepciones;
import org.example.menu.menuMain;
import org.example.repository.*;

import static org.example.menu.menuMain.requestSpeciliatydMessage;

public class userController {

    private final bookController bookcontroller = new bookController();
    private final bookRepository bookrepository = new bookRepository();
    private final clienteRepository cliente_Repository = new clienteRepository();
    private final administrativoRepository adm_Repository = new administrativoRepository();
    private static final Config config = configRepository.loadConfig();
    Scanner scanner = new Scanner(System.in);

    public userController() {
    }

    public void inicio(cliente user) {
        boolean exit = false;
        List<book> libros = bookrepository.getListaLibros();

        for (int i = 0; i < libros.size() && !exit; i++) {
            System.out.println(libros.get(i));

            System.out.println("01. Solicitar.");
            System.out.println("02. Agregar a Favoritos");
            System.out.println("03. Anterior.");
            System.out.println("04. Siguiente.");
            System.out.println("05. Perfil.");
            System.out.println("06. Salir..");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1 -> addBook(user, i, libros.get(i));
                case 2 -> addBookFav(user, i);
                case 3 -> i = anterior(i);
                case 4 -> {
                }
                case 5 -> perfil(user);
                case 6 -> exit = true;
                default -> System.out.println("Opción invalida");
            }
        }
    }

    public int anterior(int i) {
        ///controlo que el index no sea mayor o igual a -2,
        int index = i - 2;
        if (index < -1) {
            index = -1;//retorno -1 , porque al entrar al for, lo incrementa en 1
        }
        return index;
    }

    public void perfil(cliente user) {
        boolean exit = false;

        while (!exit) {
            System.out.println("01. Ver libros solicitados.");
            System.out.println("02. Ver libros Favoritos.");
            System.out.println("03. Ver Historial libros solicitados.");
            System.out.println("04. Salir.");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1 -> verLibrosSolicitados(user);
                case 2 -> verLibrosFavoritos(user);
                case 3 -> verHistorialSolicitados(user);
                case 4 -> exit = true;
            }
        }
    }

    public void verLibrosSolicitados(cliente user) {
        List<book> solicitados = user.getCurrentlyBorrowedBook();

        for (int i = 0; i < solicitados.size(); i++) {
            book b = solicitados.get(i);
            System.out.println(b);

            System.out.println("01. Devolver? s/n.");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("s")) {
                devolucion(user, b);
                solicitados.remove(i); // Eliminar el elemento actual de manera segura
                i--; // Ajustar el índice después de la eliminación
            }
        }

    }


    public void devolucion(cliente user, book b) {
        user.getReturnHistory().put(b.getIdBook(), b);
    }
    public void verLibrosFavoritos(cliente user) {
        Set<book> fav = user.getListFavBook();

        for (book b : fav) {
            System.out.println(b);
        }

    }

    public void verHistorialSolicitados(cliente user) {
        Map<Integer, book> historial = user.getReturnHistory();

        for (Map.Entry<Integer, book> entry : historial.entrySet()) {
            Integer key = entry.getKey();
            book libro = entry.getValue();
            System.out.println("ID: " + key + "\n" + libro);
        }

    }

    public void addBookFav(cliente user, int index) {
        user.getListFavBook().add(bookrepository.listaLibros.get(index));
    }

    public void addBook(cliente user, int index, book libro) {
        if (bookcontroller.checkStock(libro)) {
            List<book> aux = bookrepository.getListaLibros();
            if (index >= 0 && index < aux.size()) {
                user.getCurrentlyBorrowedBook().add(aux.get(index));
                book b = aux.get(index);
                b.setStock(b.getStock() - 1);
            } else {
                throw new IndexOutOfBoundsException("Codigo de libro erroneo.");
            }
        }
    }

    public void createPersona(String dni, String name, String lastName, Integer age, String email, String phone, String adress, String password) throws IOException {

        boolean check = cliente_Repository.dniCheck(dni);
        if (!check) {
            if (config.getAdminPassword().equals(password)) {
                System.out.println(menuMain.admMessage);
                System.out.println(menuMain.requestPassswordMessage);
                password = scanner.nextLine();
                System.out.println(menuMain.requestDepartamentMessage);
                String departament = scanner.nextLine();
                System.out.println(requestSpeciliatydMessage);
                String speciliaty = scanner.nextLine();

                adm_Repository.Register(new administrativo(dni, name, lastName, age, email, phone, adress, password, true, departament, speciliaty));
            } else {
                cliente_Repository.Register(new cliente(dni, name, lastName, age, email, phone, adress, password, false));
            }
        } else {
            MisExcepciones.dniExistente();
        }


    }

    public Optional<cliente> login(String dni, String password) {

        ///si la llamada a findUser devuelve null, "ofNullable" lo encapsula como un "optional" y lo verificamos en el primer if.
        ///Optional es una clase que utiliza genericos y verifica si tiene o no un valor dentro. Evitando el "NullPointerException".
        Optional<cliente> requestedUser = Optional.ofNullable(cliente_Repository.findUser(dni));

        if (requestedUser.isEmpty()) {
            System.out.println("Usuario no existe");
            return Optional.empty();

        }
        if (requestedUser.get().getPassword().equals(password)) {
            System.out.println("Logueado exitosamente");

            return requestedUser;
        } else {
            System.out.println("Contraseña incorrecta");

            return Optional.empty();

        }

    }

    /*public Optional<administrativo> login2(String dni, String password) {
        return Optional.ofNullable(user_Repository.findUser(dni))
                .filter(administrativo -> administrativo.getPassword().equals(password))
                .map(administrativo -> {
                    System.out.println("Logueado exitosamente");
                    return administrativo;
                });
    }*/


    public void logOut() {

    }

    public void requestBook(Book book) {

    }

    public void returnBook(Book book) {

    }
}
