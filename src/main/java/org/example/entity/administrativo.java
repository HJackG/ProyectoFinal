package org.example.entity;

public class administrativo extends persona {

    private String departament;

    private String speciality;

    public administrativo(String dni, String name, String lastName, Integer age, String email, String phone, String adress, String password, boolean rol, String departament, String speciality) {
        super(dni, name, lastName, age, email, phone, adress, password, rol);
        this.departament = departament;
        this.speciality = speciality;
    }

    public void viewStadistics (){

    }
}
