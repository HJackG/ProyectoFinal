package org.example.menu;

import org.example.controller.ClienteController;
import org.example.entity.Cliente;
import org.example.exception.MisExcepciones;
import org.example.repository.AdminRepository;
import org.example.repository.BookRepository;
import org.example.repository.ClienteRepository;

import java.util.Optional;
import java.util.Scanner;

public class MenuMain {

    public final String requestDniMessage = "Ingrese su numero de DNI (sin puntos, ni coma): ";
    public static final String requestPasswordMessage = "Ingrese su contraseña: ";

    private final Scanner scanner = new Scanner(System.in);

    private final ClienteController clienteController = new ClienteController();
    private final ClienteRepository clienteRepository = new ClienteRepository();

    private final BookRepository bookRepository = new BookRepository();

    private final AdminRepository adminRepository = new AdminRepository();



    public void mainFlow() {
        boolean exit = false;

        cargarJson();

        while (!exit) {
            String loginMenu = """
                    Bienvenido!
                    1. Loguearse
                    2. Loguearse como ADM
                    3. Registrarse
                    4. Salir
                    """;
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
        System.out.println(requestPasswordMessage);
        String passwordInput = scanner.nextLine();

        Optional<Cliente> user = clienteController.login(userDniInput, passwordInput);
        if (user.isPresent()) {
            Cliente c = user.get();
            clienteController.inicio(c);
        } else {
            MisExcepciones.usuarioNoEncontrado();
        }
    }

    private void loginFlowAdm() {
        scanner.nextLine();
        System.out.println(requestDniMessage);
        String userDniInput = scanner.nextLine();
        System.out.println(requestPasswordMessage);
        String passwordInput = scanner.nextLine();

        //Optional<administrativo> user = userController.login2(userDniInput, passwordInput);
    }

    private void registerFlow() {

        clienteController.createPersona();

        System.out.println("Registrado exitosamente!");
    }

    public void finalizarPrograma() {
        bookRepository.saveLibros();
        clienteRepository.saveClientes();
        adminRepository.saveAdm();
    }

    public void cargarJson() {
        bookRepository.loadLibros();
        clienteRepository.loadClientes();
        adminRepository.loadAdm();
    }

}
