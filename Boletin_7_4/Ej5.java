package Boletin_7_4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba las líneas a añadir al archivo (Presione Enter para terminar):");

        try {
            // Abrir el archivo en modo de escritura
            BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt", true));

            // Leer líneas del teclado y escribirlas en el archivo
            String line;
            while (!(line = scanner.nextLine()).isEmpty()) {
                writer.write(line);
                writer.newLine();
            }

            // Cerrar el archivo
            writer.close();

            System.out.println("Las líneas se han añadido correctamente al archivo.");
        } catch (IOException e) {
            System.err.println("Ha ocurrido un error al escribir en el archivo: " + e.getMessage());
        }
    }
}

