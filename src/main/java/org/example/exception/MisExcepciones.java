package org.example.exception;

import java.io.IOException;

public class MisExcepciones extends RuntimeException {

    public static void dniExistente()  {
        throw new RuntimeException("El dni ya tiene una cuenta asociada.");

    }
    public static void usuarioNoEncontrado()   {
        throw new RuntimeException("El usuario no existe.");

    }  public static void libroSinStock()   {
        throw new RuntimeException("El libro solicitado no se encuentra disponible.");

    }
}
