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
import java.util.Map;
import java.util.TreeMap;

public class administrativoRepository implements CRUD, Logueo {
    private final String ADM_PATH = "src/main/java/resources/administrativos.json";
    private final Gson gson = new Gson();

    public Map<String, persona> mapAdm;

    public administrativoRepository() {
        this.mapAdm = new TreeMap<>();
    }

    @Override
    public void Register(Object a) {
        if (a instanceof administrativo) {
            administrativo adm = (administrativo) a;
            mapAdm.put(adm.getDni(), adm);
            saveAdm();
        }
    }

    @Override
    public administrativo findUser(Object o) {
        if (o instanceof String) {
            administrativo a = (administrativo) mapAdm.get(o);
            if (a == null) {
                MisExcepciones.usuarioNoEncontrado();
            }
            return a;
        } else {
            MisExcepciones.datoInvalido();
        }
        return null;
    }

    public void loadAdm() {
        try (Reader reader = new FileReader(ADM_PATH)) {
            Type userListType = new TypeToken<Map<String, administrativo>>() {
            }.getType();
            mapAdm = gson.fromJson(reader, userListType);
            if (mapAdm == null) {
                mapAdm = new TreeMap<>();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveAdm() {
        try (Writer writer = new FileWriter(ADM_PATH)) {
            gson.toJson(mapAdm, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
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
