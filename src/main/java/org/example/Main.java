package org.example;
import org.example.entity.Book;
import org.example.menu.MenuMain;
import org.example.repository.BookRepository;
import org.example.repository.ClienteRepository;
import java.io.IOException;

public class Main {
    private static final MenuMain menu = new MenuMain();

    public static void main(String[] args) throws IOException {

        /////////////////////////////////////////////////////////////////
        ///////////////////////SECTOR PRUEBA
        //////////////////////////////////////////////////////////////////
        ClienteRepository clientrepository = new ClienteRepository();
        BookRepository libroRepo = new BookRepository();

        Book libro1 = new Book("El Naufrago", "Tomas Rebord", "Planeta", "Ciencia Ficción", "Español", "Una historia épica en el espacio.", 2, 500);
        Book libro2 = new Book("Cien Años de Soledad", "Gabriel García Márquez", "Sudamericana", "Realismo Mágico", "Español", "La historia de la familia Buendía.", 5, 1000);
        Book libro3 = new Book("1984", "George Orwell", "Secker & Warburg", "Distopía", "Inglés", "Un futuro distópico bajo vigilancia.", 10, 1500);
        Book libro4 = new Book("El Señor de los Anillos", "J.R.R. Tolkien", "Allen & Unwin", "Fantasía", "Inglés", "La batalla por la Tierra Media.", 8, 2000);
        Book libro5 = new Book("Don Quijote de la Mancha", "Miguel de Cervantes", "Francisco de Robles", "Aventura", "Español", "Las aventuras de Don Quijote y Sancho Panza.", 3, 750);
        Book libro6 = new Book("Moby Dick", "Herman Melville", "Harper & Brothers", "Aventura", "Inglés", "La caza de la gran ballena blanca.", 4, 300);
        Book libro7 = new Book("El Principito", "Antoine de Saint-Exupéry", "Reynal & Hitchcock", "Fantasía", "Francés", "La historia de un pequeño príncipe.", 7, 5000);
        Book libro8 = new Book("La Divina Comedia", "Dante Alighieri", "Giovanni Boccaccio", "Poesía", "Italiano", "Un viaje épico por el infierno, purgatorio y paraíso.", 2, 400);
        Book libro9 = new Book("Harry Potter y la Piedra Filosofal", "J.K. Rowling", "Bloomsbury", "Fantasía", "Inglés", "El inicio de la saga de Harry Potter.", 12, 10000);
        Book libro10 = new Book("Orgullo y Prejuicio", "Jane Austen", "T. Egerton", "Romántico", "Inglés", "La historia de Elizabeth Bennet.", 6, 3500);
        Book libro11 = new Book("Ensayo sobre la ceguera", "José Saramago", "Alfaguara", "Ficción", "Portugués", "Una epidemia de ceguera blanca afecta a una ciudad.", 9, 1200);
        Book libro12 = new Book("Crimen y castigo", "Fyodor Dostoievsky", "Ediciones Cátedra", "Ficción", "Ruso", "La historia de un hombre que lucha con su conciencia.", 7, 850);
        Book libro13 = new Book("El Aleph", "Jorge Luis Borges", "Emecé Editores", "Fantasía", "Español", "Una colección de cuentos de Borges.", 5, 600);
        Book libro14 = new Book("Cartas Marcadas", "Alejandro Dolina", "Planeta", "Ficción", "Español", "Un conjunto de historias con un toque de misterio.", 4, 450);
        Book libro15 = new Book("La Tregua", "Mario Benedetti", "Editorial Sudamericana", "Ficción", "Español", "Un diario íntimo de un hombre que encuentra el amor.", 3, 700);
        Book libro16 = new Book("El Banquete", "Platón", "Penguin Clásicos", "Filosofía", "Griego", "Un diálogo sobre el amor y la belleza.", 6, 500);
        Book libro17 = new Book("Más Platón y menos Prozac", "Lou Marinoff", "Ediciones B", "Filosofía", "Español", "Una guía para resolver problemas cotidianos con filosofía.", 5, 300);
        Book libro18 = new Book("El mundo de Sofía", "Jostein Gaarder", "Siruela", "Filosofía", "Noruego", "Una novela sobre la historia de la filosofía.", 10, 900);
        Book libro19 = new Book("Ética a Nicómaco", "Aristóteles", "Gredos", "Filosofía", "Griego", "Un tratado sobre la ética y la virtud.", 2, 200);
        Book libro20 = new Book("Meditaciones", "Marco Aurelio", "Alianza Editorial", "Filosofía", "Latín", "Reflexiones personales del emperador romano.", 4, 650);
        Book libro21 = new Book("El nombre de la rosa", "Umberto Eco", "Bompiani", "Misterio", "Italiano", "Un asesinato en una abadía medieval.", 7, 800);
        Book libro22 = new Book("La casa de los espíritus", "Isabel Allende", "Debolsillo", "Realismo Mágico", "Español", "La historia de la familia Trueba.", 5, 900);
        Book libro23 = new Book("Rayuela", "Julio Cortázar", "Pantheon Books", "Ficción", "Español", "Una novela innovadora y no lineal.", 4, 600);
        Book libro24 = new Book("Juego de tronos", "George R.R. Martin", "Gigamesh", "Fantasía", "Inglés", "La lucha por el trono de hierro.", 12, 15000);
        Book libro25 = new Book("El Código Da Vinci", "Dan Brown", "Doubleday", "Thriller", "Inglés", "Un misterio relacionado con el Santo Grial.", 8, 2000);
        Book libro26 = new Book("La sombra del viento", "Carlos Ruiz Zafón", "Planeta", "Misterio", "Español", "Una historia de libros y secretos en Barcelona.", 9, 7000);
        Book libro27 = new Book("El alquimista", "Paulo Coelho", "HarperCollins", "Ficción", "Portugués", "Un joven pastor en busca de un tesoro.", 11, 2500);
        Book libro28 = new Book("Siddhartha", "Hermann Hesse", "New Directions", "Filosofía", "Alemán", "La búsqueda espiritual de un hombre.", 3, 1500);
        Book libro29 = new Book("La Odisea", "Homero", "Penguin Clásicos", "Épico", "Griego", "Las aventuras de Odiseo.", 4, 1800);
        Book libro30 = new Book("El retrato de Dorian Gray", "Oscar Wilde", "Lippincott's Monthly Magazine", "Fantasía", "Inglés", "Un hombre cuya imagen envejece en lugar de él.", 6, 1200);
        Book libro31 = new Book("Drácula", "Bram Stoker", "Archibald Constable and Company", "Horror", "Inglés", "La historia del conde Drácula.", 8, 3000);
        Book libro32 = new Book("Frankenstein", "Mary Shelley", "Lackington, Hughes, Harding, Mavor & Jones", "Horror", "Inglés", "El monstruo creado por el Dr. Frankenstein.", 5, 2200);
        Book libro33 = new Book("Los hermanos Karamazov", "Fyodor Dostoievsky", "The Russian Messenger", "Ficción", "Ruso", "Las luchas de una familia rusa.", 7, 1500);
        Book libro34 = new Book("El amor en los tiempos del cólera", "Gabriel García Márquez", "Oveja Negra", "Realismo Mágico", "Español", "Una historia de amor que dura décadas.", 9, 1800);
        Book libro35 = new Book("Pedro Páramo", "Juan Rulfo", "Fondo de Cultura Económica", "Realismo Mágico", "Español", "Un hombre busca a su padre en un pueblo fantasma.", 5, 1000);
        Book libro36 = new Book("Fahrenheit 451", "Ray Bradbury", "Ballantine Books", "Distopía", "Inglés", "Un futuro donde los libros están prohibidos.", 6, 2300);
        Book libro37 = new Book("El gran Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", "Ficción", "Inglés", "La vida y los tiempos de Jay Gatsby.", 10, 4000);
        Book libro38 = new Book("Matar a un ruiseñor", "Harper Lee", "J.B. Lippincott & Co.", "Ficción", "Inglés", "Una historia de justicia y racismo en el sur de EE. UU.", 12, 4500);
        Book libro39 = new Book("Los juegos del hambre", "Suzanne Collins", "Scholastic Press", "Distopía", "Inglés", "Un futuro donde jóvenes luchan a muerte en un evento televisado.", 15, 5000);
        Book libro40 = new Book("Memorias de Adriano", "Marguerite Yourcenar", "Plon", "Ficción Histórica", "Francés", "Las memorias ficticias del emperador romano Adriano.", 5, 900);
        Book libro41 = new Book("El hombre en busca de sentido", "Viktor Frankl", "Beacon Press", "Filosofía", "Alemán", "Un análisis existencial basado en las experiencias en campos de concentración.", 8, 700);
        Book libro42 = new Book("La insoportable levedad del ser", "Milan Kundera", "Harper & Row", "Filosofía", "Checo", "Una exploración del amor y la política en Checoslovaquia.", 7, 1200);
        Book libro43 = new Book("El Perfume", "Patrick Süskind", "Diogenes Verlag", "Ficción", "Alemán", "La historia de un asesino obsesionado con el olor perfecto.", 6, 1400);
        Book libro44 = new Book("Los pilares de la Tierra", "Ken Follett", "Macmillan", "Ficción Histórica", "Inglés", "La construcción de una catedral en la Inglaterra medieval.", 10, 3000);
        Book libro45 = new Book("El Conde de Montecristo", "Alexandre Dumas", "Penguin Clásicos", "Aventura", "Francés", "Un hombre busca venganza contra quienes lo traicionaron.", 8, 1600);
        Book libro46 = new Book("Madame Bovary", "Gustave Flaubert", "Revue de Paris", "Ficción", "Francés", "Las desventuras de una mujer insatisfecha en la Francia rural.", 5, 1100);
        Book libro47 = new Book("Ulises", "James Joyce", "Shakespeare and Company", "Ficción", "Inglés", "Un día en la vida de Leopold Bloom.", 4, 700);
        Book libro48 = new Book("Ana Karenina", "Leo Tolstoy", "The Russian Messenger", "Ficción", "Ruso", "La trágica historia de una mujer en la alta sociedad rusa.", 6, 1300);
        Book libro49 = new Book("La metamorfosis", "Franz Kafka", "Kurt Wolff Verlag", "Ficción", "Alemán", "Un hombre se convierte en un insecto gigante.", 5, 2500);
        Book libro50 = new Book("El guardián entre el centeno", "J.D. Salinger", "Little, Brown and Company", "Ficción", "Inglés", "Las reflexiones de un adolescente en Nueva York.", 10, 3200);

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