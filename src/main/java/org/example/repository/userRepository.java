package org.example.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.entity.cliente;
import org.example.entity.persona;
import org.example.exception.MisExcepciones;
import org.example.repository.impl.CRUD;

import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

public class userRepository implements CRUD {
    private final String USER_PATH = "src/main/java/resources/user.json";
    private final Gson gson = new Gson();

    private Map<String, persona> listaPersonas = new HashMap<>();

    persona Persona = new cliente();

    @Override
    public Object create() {
        return null;
    }

    @Override
    public Object read(Object o) {
        return null;
    }

    @Override
    public Object update(Object o) {
        return null;
    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public void Register(Object o) {
        if (o instanceof persona) {
            listaPersonas.put(((persona) o).getDni(), (persona) o);
            save();
        }

    }


    public boolean dniCheck(String dni) {
        return listaPersonas.containsKey(dni);
    }

    public persona findUser(String dni) {

        if (dniCheck(dni)) {
            return listaPersonas.get(dni);
        } else {
            MisExcepciones.usuarioNoEncontrado();
        }
        return null;
    }

    private void loadPersonas() {
        try (Reader reader = new FileReader(USER_PATH)) {
            Type userListType = new TypeToken<List<persona>>() {
            }.getType();
            List<persona> personas = gson.fromJson(reader, userListType);
            for (persona persona : personas) {
                listaPersonas.put(persona.getDni(), persona);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save() {

        try (Writer writer = new FileWriter(USER_PATH)) {
            gson.toJson(listaPersonas, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
