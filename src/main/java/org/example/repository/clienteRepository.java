package org.example.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.entity.administrativo;
import org.example.entity.cliente;
import org.example.entity.persona;
import org.example.exception.MisExcepciones;
import org.example.repository.impl.CRUD;
import org.example.repository.impl.Logueo;

import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

public class clienteRepository implements CRUD, Logueo {
    private final String CLIENTE_PATH = "src/main/java/resources/clientes.json";
    private final Gson gson = new Gson();
    public static Map<String, cliente> mapClientes = new TreeMap<>();

    public clienteRepository() {
    }

    @Override
    public void Register(Object c) {
        if (c instanceof cliente) {
            cliente client = (cliente) c;
            mapClientes.put(client.getDni(), client);
            saveClientes();
        }
    }

    @Override
    public cliente findUser(Object o) {
        if (o instanceof String) {
            cliente p =(cliente) mapClientes.get(o);
            if (p == null) {
                MisExcepciones.usuarioNoEncontrado();
            }
            return p;
        } else {
            MisExcepciones.datoInvalido();
        }
        return null;
    }


    public boolean dniCheck(String dni) {
        return mapClientes.containsKey(dni);
    }

    public void saveClientes() {
        try (Writer writer = new FileWriter(CLIENTE_PATH)) {
            gson.toJson(mapClientes, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void loadClientes() {
        try (Reader reader = new FileReader(CLIENTE_PATH)) {
            Type userListType = new TypeToken<Map<String, cliente>>() {
            }.getType();
            mapClientes = gson.fromJson(reader, userListType);
            if (mapClientes == null) {
                mapClientes = new TreeMap<>();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
}
