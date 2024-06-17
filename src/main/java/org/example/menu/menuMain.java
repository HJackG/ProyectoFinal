package org.example.menu;

import org.example.controller.bookController;
import org.example.controller.userController;
import org.example.entity.book;
import org.example.entity.cliente;
import org.example.entity.persona;
import org.example.repository.bookRepository;
import org.example.repository.userRepository;

import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

public class menuMain {

    private final String loginMenu = """
            Bienvenido!
            1. Loguearse
            2. Registrarse
            3. Salir
            """;
    public final String requestNameMessage = "Ingrese su nombre: ";
    public final String requestDniMessage = "Ingrese su numero de DNI (sin puntos, ni coma): ";
    public final String requestlastNameMessage = "Ingrese su apellido: ";
    public final String requestAgeMessage = "Ingrese su edad: ";
    public final String requestEmailMessage = "Ingrese su email: ";
    public final String requestPhoneMessage = "Ingrese su numero de telefono: ";
    public final String requestAdressMessage = "Ingrese su direccion: ";
    public static final String requestPassswordMessage = "Ingrese su contraseña: ";
    public static final String admMessage = "Se asigno correctamente su rol como administrativo.";
    public static final String requestDepartamentMessage = "Ingrese su departamento: ";
    public static final String requestSpeciliatydMessage = "Ingrese su especialidad: ";


    private final Scanner scanner = new Scanner(System.in);
    private final userController userController = new userController();

    public void mainFlow() throws IOException {
        Boolean logged = false;
        Boolean exit = false;

        while (!exit) {
            System.out.println(loginMenu);
            int menuOption = scanner.nextInt();

            switch (menuOption) {
                case 1 -> loginFlow();
                case 2 -> registerFlow();
                case 3 -> exit = true;
                default -> System.out.println("Opción invalida");
            }
        }
    }

    private void loginFlow() {
        scanner.nextLine();
        System.out.println(requestDniMessage);
        String userdniInput = scanner.nextLine();
        System.out.println(requestPassswordMessage);
        String passwordInput = scanner.nextLine();

        Optional<persona> p = userController.login(userdniInput, passwordInput);
        if (p.isEmpty()) {

        }
        if (p.isPresent()) {
            persona user = ((persona) p.get());

            if (user instanceof cliente) {

                userController.inicio((cliente) user);
            }

        }

    }


    private void registerFlow() throws IOException {
        scanner.nextLine();
        System.out.println(requestDniMessage);
        String dni = scanner.nextLine();

        System.out.println(requestNameMessage);
        String name = scanner.nextLine();

        System.out.println(requestlastNameMessage);
        String lastName = scanner.nextLine();

        System.out.println(requestAgeMessage);
        Integer age = scanner.nextInt();
        scanner.nextLine();

        System.out.println(requestEmailMessage);
        String email = scanner.nextLine();

        System.out.println(requestPhoneMessage);
        String phone = scanner.nextLine();

        System.out.println(requestAdressMessage);
        String adress = scanner.nextLine();

        System.out.println(requestPassswordMessage);
        String passwordInput = scanner.nextLine();

        userController.createPersona(dni, name, lastName, age, email, phone, adress, passwordInput);

        System.out.println("Registrado exitosamente!");
    }


}
