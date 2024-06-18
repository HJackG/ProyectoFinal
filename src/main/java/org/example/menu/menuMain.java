package org.example.menu;

import org.example.controller.userController;
import org.example.entity.administrativo;
import org.example.entity.cliente;
import org.example.entity.persona;
import org.example.exception.MisExcepciones;
import org.example.repository.administrativoRepository;
import org.example.repository.bookRepository;
import org.example.repository.clienteRepository;

import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

public class menuMain {

    private final String loginMenu = """
            Bienvenido!
            1. Loguearse
            2. Loguearse como ADM
            3. Registrarse
            4. Salir
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
    private final userController userControl = new userController();
    private final bookRepository bookRP = new bookRepository();
    private final clienteRepository clienteRP = new clienteRepository();
    private final administrativoRepository admRP = new administrativoRepository();

    public void mainFlow() throws IOException {
        Boolean exit = false;
        cargarJson();
        while (!exit) {
            System.out.println(loginMenu);
            int menuOption = scanner.nextInt();

            switch (menuOption) {
                case 1 -> loginFlow();
                case 2 -> loginFlowAdm();
                case 3 -> registerFlow();
                case 4 -> exit = true;
                default -> System.out.println("Opción invalida");
            }
        }
        finalizarPrograma();
    }



    private void loginFlow() {
        scanner.nextLine();
        System.out.println(requestDniMessage);
        String userDniInput = scanner.nextLine();
        System.out.println(requestPassswordMessage);
        String passwordInput = scanner.nextLine();

        Optional<cliente> user = userControl.login(userDniInput, passwordInput);
        if (user.isPresent()) {
            cliente c = user.get();
            userControl.inicio(c);
        } else {
            MisExcepciones.usuarioNoEncontrado();
        }
    }

    private void loginFlowAdm() {
        scanner.nextLine();
        System.out.println(requestDniMessage);
        String userDniInput = scanner.nextLine();
        System.out.println(requestPassswordMessage);
        String passwordInput = scanner.nextLine();

        //Optional<administrativo> user = userController.login2(userDniInput, passwordInput);


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

        userControl.createPersona(dni, name, lastName, age, email, phone, adress, passwordInput);

        System.out.println("Registrado exitosamente!");
    }
    public void finalizarPrograma() {
        bookRP.saveLibros();
        clienteRP.saveClientes();
        admRP.saveAdm();

    }

    public void cargarJson() {
        bookRP.loadLibros();
        clienteRP.loadClientes();
        admRP.loadAdm();

    }

}
