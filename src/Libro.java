import java.util.Scanner;

public class Libro {

    String titulo;
    String autor;
    String ISBN;
    boolean disponible;

    Libro(String t, String a, String i) {
        titulo = t;
        autor = a;
        ISBN = i;
        disponible = true;
    }

    void prestar(){
        if (disponible) {
            disponible = false;
            System.out.println("El libro fue prestado");
        } else {
            System.out.println("No disponible");
        }
    }

    void devolver(){
        disponible = true;
        System.out.println("Libro devuelto");
    }

    void mostrar(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Disponible: " + disponible);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Libro libro = new Libro("El hobbit", "Tolkien", "123");

        int opcion = 1;

        while(opcion != 0){

            System.out.println("1- Prestar libro");
            System.out.println("2- Devolver libro");
            System.out.println("3- Mostrar informacion del libro");
            System.out.println("0- Salir");

            opcion = sc.nextInt();

            if (opcion == 1){
                libro.prestar();
            }

            if (opcion == 2){
                libro.devolver();
            }

            if (opcion == 3){
                libro.mostrar();
            }
        }
    }
}