package org.example;

import org.example.entity.book;
import org.example.entity.cliente;
import org.example.entity.persona;
import org.example.menu.menuMain;
import org.example.repository.bookRepository;
import org.example.repository.clienteRepository;

import java.io.IOException;
import java.util.List;


public class Main {
    private static final menuMain menu = new menuMain();

    public static void main(String[] args) throws IOException {

        /////////////////////////////////////////////////////////////////
        ///////////////////////SECTOR PRUEBA
        //////////////////////////////////////////////////////////////////
        clienteRepository clientrepository = new clienteRepository();
        bookRepository libroRepo = new bookRepository();

        book libro1 = new book("El Naufrago", "Tomas Rebord", "Planeta", "Ciencia Ficción", "Español", "Una historia épica en el espacio.", 2, 500);
        book libro2 = new book("Cien Años de Soledad", "Gabriel García Márquez", "Sudamericana", "Realismo Mágico", "Español", "La historia de la familia Buendía.", 5, 1000);
        book libro3 = new book("1984", "George Orwell", "Secker & Warburg", "Distopía", "Inglés", "Un futuro distópico bajo vigilancia.", 10, 1500);
        book libro4 = new book("El Señor de los Anillos", "J.R.R. Tolkien", "Allen & Unwin", "Fantasía", "Inglés", "La batalla por la Tierra Media.", 8, 2000);
        book libro5 = new book("Don Quijote de la Mancha", "Miguel de Cervantes", "Francisco de Robles", "Aventura", "Español", "Las aventuras de Don Quijote y Sancho Panza.", 3, 750);
        book libro6 = new book("Moby Dick", "Herman Melville", "Harper & Brothers", "Aventura", "Inglés", "La caza de la gran ballena blanca.", 4, 300);
        book libro7 = new book("El Principito", "Antoine de Saint-Exupéry", "Reynal & Hitchcock", "Fantasía", "Francés", "La historia de un pequeño príncipe.", 7, 5000);
        book libro8 = new book("La Divina Comedia", "Dante Alighieri", "Giovanni Boccaccio", "Poesía", "Italiano", "Un viaje épico por el infierno, purgatorio y paraíso.", 2, 400);
        book libro9 = new book("Harry Potter y la Piedra Filosofal", "J.K. Rowling", "Bloomsbury", "Fantasía", "Inglés", "El inicio de la saga de Harry Potter.", 12, 10000);
        book libro10 = new book("Orgullo y Prejuicio", "Jane Austen", "T. Egerton", "Romántico", "Inglés", "La historia de Elizabeth Bennet.", 6, 3500);
        book libro11 = new book("Ensayo sobre la ceguera", "José Saramago", "Alfaguara", "Ficción", "Portugués", "Una epidemia de ceguera blanca afecta a una ciudad.", 9, 1200);
        book libro12 = new book("Crimen y castigo", "Fyodor Dostoievsky", "Ediciones Cátedra", "Ficción", "Ruso", "La historia de un hombre que lucha con su conciencia.", 7, 850);
        book libro13 = new book("El Aleph", "Jorge Luis Borges", "Emecé Editores", "Fantasía", "Español", "Una colección de cuentos de Borges.", 5, 600);
        book libro14 = new book("Cartas Marcadas", "Alejandro Dolina", "Planeta", "Ficción", "Español", "Un conjunto de historias con un toque de misterio.", 4, 450);
        book libro15 = new book("La Tregua", "Mario Benedetti", "Editorial Sudamericana", "Ficción", "Español", "Un diario íntimo de un hombre que encuentra el amor.", 3, 700);
        book libro16 = new book("El Banquete", "Platón", "Penguin Clásicos", "Filosofía", "Griego", "Un diálogo sobre el amor y la belleza.", 6, 500);
        book libro17 = new book("Más Platón y menos Prozac", "Lou Marinoff", "Ediciones B", "Filosofía", "Español", "Una guía para resolver problemas cotidianos con filosofía.", 5, 300);
        book libro18 = new book("El mundo de Sofía", "Jostein Gaarder", "Siruela", "Filosofía", "Noruego", "Una novela sobre la historia de la filosofía.", 10, 900);
        book libro19 = new book("Ética a Nicómaco", "Aristóteles", "Gredos", "Filosofía", "Griego", "Un tratado sobre la ética y la virtud.", 2, 200);
        book libro20 = new book("Meditaciones", "Marco Aurelio", "Alianza Editorial", "Filosofía", "Latín", "Reflexiones personales del emperador romano.", 4, 650);
        book libro21 = new book("El nombre de la rosa", "Umberto Eco", "Bompiani", "Misterio", "Italiano", "Un asesinato en una abadía medieval.", 7, 800);
        book libro22 = new book("La casa de los espíritus", "Isabel Allende", "Debolsillo", "Realismo Mágico", "Español", "La historia de la familia Trueba.", 5, 900);
        book libro23 = new book("Rayuela", "Julio Cortázar", "Pantheon Books", "Ficción", "Español", "Una novela innovadora y no lineal.", 4, 600);
        book libro24 = new book("Juego de tronos", "George R.R. Martin", "Gigamesh", "Fantasía", "Inglés", "La lucha por el trono de hierro.", 12, 15000);
        book libro25 = new book("El Código Da Vinci", "Dan Brown", "Doubleday", "Thriller", "Inglés", "Un misterio relacionado con el Santo Grial.", 8, 2000);
        book libro26 = new book("La sombra del viento", "Carlos Ruiz Zafón", "Planeta", "Misterio", "Español", "Una historia de libros y secretos en Barcelona.", 9, 7000);
        book libro27 = new book("El alquimista", "Paulo Coelho", "HarperCollins", "Ficción", "Portugués", "Un joven pastor en busca de un tesoro.", 11, 2500);
        book libro28 = new book("Siddhartha", "Hermann Hesse", "New Directions", "Filosofía", "Alemán", "La búsqueda espiritual de un hombre.", 3, 1500);
        book libro29 = new book("La Odisea", "Homero", "Penguin Clásicos", "Épico", "Griego", "Las aventuras de Odiseo.", 4, 1800);
        book libro30 = new book("El retrato de Dorian Gray", "Oscar Wilde", "Lippincott's Monthly Magazine", "Fantasía", "Inglés", "Un hombre cuya imagen envejece en lugar de él.", 6, 1200);
        book libro31 = new book("Drácula", "Bram Stoker", "Archibald Constable and Company", "Horror", "Inglés", "La historia del conde Drácula.", 8, 3000);
        book libro32 = new book("Frankenstein", "Mary Shelley", "Lackington, Hughes, Harding, Mavor & Jones", "Horror", "Inglés", "El monstruo creado por el Dr. Frankenstein.", 5, 2200);
        book libro33 = new book("Los hermanos Karamazov", "Fyodor Dostoievsky", "The Russian Messenger", "Ficción", "Ruso", "Las luchas de una familia rusa.", 7, 1500);
        book libro34 = new book("El amor en los tiempos del cólera", "Gabriel García Márquez", "Oveja Negra", "Realismo Mágico", "Español", "Una historia de amor que dura décadas.", 9, 1800);
        book libro35 = new book("Pedro Páramo", "Juan Rulfo", "Fondo de Cultura Económica", "Realismo Mágico", "Español", "Un hombre busca a su padre en un pueblo fantasma.", 5, 1000);
        book libro36 = new book("Fahrenheit 451", "Ray Bradbury", "Ballantine Books", "Distopía", "Inglés", "Un futuro donde los libros están prohibidos.", 6, 2300);
        book libro37 = new book("El gran Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", "Ficción", "Inglés", "La vida y los tiempos de Jay Gatsby.", 10, 4000);
        book libro38 = new book("Matar a un ruiseñor", "Harper Lee", "J.B. Lippincott & Co.", "Ficción", "Inglés", "Una historia de justicia y racismo en el sur de EE. UU.", 12, 4500);
        book libro39 = new book("Los juegos del hambre", "Suzanne Collins", "Scholastic Press", "Distopía", "Inglés", "Un futuro donde jóvenes luchan a muerte en un evento televisado.", 15, 5000);
        book libro40 = new book("Memorias de Adriano", "Marguerite Yourcenar", "Plon", "Ficción Histórica", "Francés", "Las memorias ficticias del emperador romano Adriano.", 5, 900);
        book libro41 = new book("El hombre en busca de sentido", "Viktor Frankl", "Beacon Press", "Filosofía", "Alemán", "Un análisis existencial basado en las experiencias en campos de concentración.", 8, 700);
        book libro42 = new book("La insoportable levedad del ser", "Milan Kundera", "Harper & Row", "Filosofía", "Checo", "Una exploración del amor y la política en Checoslovaquia.", 7, 1200);
        book libro43 = new book("El Perfume", "Patrick Süskind", "Diogenes Verlag", "Ficción", "Alemán", "La historia de un asesino obsesionado con el olor perfecto.", 6, 1400);
        book libro44 = new book("Los pilares de la Tierra", "Ken Follett", "Macmillan", "Ficción Histórica", "Inglés", "La construcción de una catedral en la Inglaterra medieval.", 10, 3000);
        book libro45 = new book("El Conde de Montecristo", "Alexandre Dumas", "Penguin Clásicos", "Aventura", "Francés", "Un hombre busca venganza contra quienes lo traicionaron.", 8, 1600);
        book libro46 = new book("Madame Bovary", "Gustave Flaubert", "Revue de Paris", "Ficción", "Francés", "Las desventuras de una mujer insatisfecha en la Francia rural.", 5, 1100);
        book libro47 = new book("Ulises", "James Joyce", "Shakespeare and Company", "Ficción", "Inglés", "Un día en la vida de Leopold Bloom.", 4, 700);
        book libro48 = new book("Ana Karenina", "Leo Tolstoy", "The Russian Messenger", "Ficción", "Ruso", "La trágica historia de una mujer en la alta sociedad rusa.", 6, 1300);
        book libro49 = new book("La metamorfosis", "Franz Kafka", "Kurt Wolff Verlag", "Ficción", "Alemán", "Un hombre se convierte en un insecto gigante.", 5, 2500);
        book libro50 = new book("El guardián entre el centeno", "J.D. Salinger", "Little, Brown and Company", "Ficción", "Inglés", "Las reflexiones de un adolescente en Nueva York.", 10, 3200);

        // Agregar los libros al repositorio
        libroRepo.listaLibros.add(libro1);
        libroRepo.listaLibros.add(libro2);
        libroRepo.listaLibros.add(libro3);
        libroRepo.listaLibros.add(libro4);
        libroRepo.listaLibros.add(libro5);
        libroRepo.listaLibros.add(libro6);
        libroRepo.listaLibros.add(libro7);
        libroRepo.listaLibros.add(libro8);
        libroRepo.listaLibros.add(libro9);
        libroRepo.listaLibros.add(libro10);
        libroRepo.listaLibros.add(libro11);
        libroRepo.listaLibros.add(libro12);
        libroRepo.listaLibros.add(libro13);
        libroRepo.listaLibros.add(libro14);
        libroRepo.listaLibros.add(libro15);
        libroRepo.listaLibros.add(libro16);
        libroRepo.listaLibros.add(libro17);
        libroRepo.listaLibros.add(libro1);
        libroRepo.listaLibros.add(libro2);
        libroRepo.listaLibros.add(libro3);
        libroRepo.listaLibros.add(libro4);
        libroRepo.listaLibros.add(libro5);
        libroRepo.listaLibros.add(libro6);
        libroRepo.listaLibros.add(libro7);
        libroRepo.listaLibros.add(libro8);
        libroRepo.listaLibros.add(libro9);
        libroRepo.listaLibros.add(libro10);
        libroRepo.listaLibros.add(libro11);
        libroRepo.listaLibros.add(libro12);
        libroRepo.listaLibros.add(libro13);
        libroRepo.listaLibros.add(libro14);
        libroRepo.listaLibros.add(libro15);
        libroRepo.listaLibros.add(libro16);
        libroRepo.listaLibros.add(libro17);
        libroRepo.listaLibros.add(libro18);
        libroRepo.listaLibros.add(libro19);
        libroRepo.listaLibros.add(libro20);
        libroRepo.listaLibros.add(libro21);
        libroRepo.listaLibros.add(libro22);
        libroRepo.listaLibros.add(libro23);
        libroRepo.listaLibros.add(libro24);
        libroRepo.listaLibros.add(libro25);
        libroRepo.listaLibros.add(libro26);
        libroRepo.listaLibros.add(libro27);
        libroRepo.listaLibros.add(libro28);
        libroRepo.listaLibros.add(libro29);
        libroRepo.listaLibros.add(libro30);
        libroRepo.listaLibros.add(libro31);
        libroRepo.listaLibros.add(libro32);
        libroRepo.listaLibros.add(libro33);
        libroRepo.listaLibros.add(libro34);
        libroRepo.listaLibros.add(libro35);
        libroRepo.listaLibros.add(libro36);
        libroRepo.listaLibros.add(libro37);
        libroRepo.listaLibros.add(libro38);
        libroRepo.listaLibros.add(libro39);
        libroRepo.listaLibros.add(libro40);
        libroRepo.listaLibros.add(libro41);
        libroRepo.listaLibros.add(libro42);
        libroRepo.listaLibros.add(libro43);
        libroRepo.listaLibros.add(libro44);
        libroRepo.listaLibros.add(libro45);
        libroRepo.listaLibros.add(libro46);
        libroRepo.listaLibros.add(libro47);
        libroRepo.listaLibros.add(libro48);
        libroRepo.listaLibros.add(libro49);
        libroRepo.listaLibros.add(libro50);
       libroRepo.saveLibros();

        //cliente cliente1 = new cliente("1", "Adrian", "Gonzalez", 30, "gonzalezadrian94b@gmail.com", "2236691369", "Jose Hernandez 2124", "1", false);
       //  clientrepository.Register(cliente1);



        ///////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////


        menu.mainFlow();
    }

}