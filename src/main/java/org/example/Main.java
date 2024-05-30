package org.example;

import org.example.menu.menuMain;

import java.io.IOException;

public class Main {
    private static final menuMain menu = new menuMain();

    public static void main(String[] args) throws IOException {
        menu.mainFlow() ;
    }

}