package Boletin_7_4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer desde la consola
        Scanner scanner = new Scanner(System.in);

        try {
            // Escribir en el archivo sin sobreescribir el contenido existente
            FileWriter fileWriter = new FileWriter("registro.txt", true);
            // Escribir en el archivo sobreescribiendo el contenido existente
            PrintWriter printWriter = new PrintWriter(fileWriter);
            // Pedir líneas hasta que se ingrese una línea vacía
            while (true) {
                // Leer una línea desde la consola
                System.out.print("Ingrese una línea para agregar al registro (o presione enter para salir): ");
                // Si se ingresa una línea vacía, se vuelve a pedir una línea
                String linea = scanner.nextLine();
                // Si se ingresa "fin", se termina el programa
                if (linea.isEmpty()) {
                    // Si se ingresa una línea vacía, se vuelve a pedir una línea
                    System.out.println("No se permiten líneas vacías. Intente nuevamente.");
                    continue;
                }
                // Si se ingresa "fin", se termina el programa
                if (linea.equals("fin")) {
                    // Si se ingresa una línea vacía, se vuelve a pedir una línea
                    break;
                }
                // Escribir la línea en el archivo
                printWriter.println(linea);
            }
            // Cerrar los flujos de escritura
            printWriter.close();
            fileWriter.close();
            // Cerrar el flujo de lectura
        } catch (IOException e) {
            // Si ocurre un error, imprimir el mensaje de error y la traza de la pila
            System.out.println("Ha ocurrido un error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}