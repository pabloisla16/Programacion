package Ej_Boletin1;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        System.out.println("Menú:");
        System.out.println("1. Crear directorio");
        System.out.println("2. Crear fichero de texto");
        System.out.println("3. Borrar fichero de texto");
        System.out.println("4. Mostrar los ficheros que contiene una carpeta");
        System.out.println("5. Salir");

        System.out.print("Elija una opción: ");
        int opcion = scanner.nextInt();

    }

}