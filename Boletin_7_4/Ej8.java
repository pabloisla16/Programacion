package Boletin_7_4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            FileWriter fileWriter = new FileWriter("bitacora.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            while (true) {
                System.out.print("Ingrese una línea para agregar a la bitácora (o presione enter para salir): ");
                String linea = scanner.nextLine();

                if (linea.isEmpty()) {
                    break;
                }

                if (validarLinea(linea)) {
                    printWriter.println(linea);
                } else {
                    System.out.println("La línea ingresada no cumple con los requisitos. Intente nuevamente.");
                }
            }

            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al escribir en el archivo.");
            e.printStackTrace();
        }
    }

    private static boolean validarLinea(String linea) {
        // Aquí se definen las condiciones que debe cumplir la línea para ser válida
        int longitudMinima = 10;
        String palabraClave = "importante";

        if (linea.length() < longitudMinima) {
            return false;
        }

        if (!linea.toLowerCase().contains(palabraClave)) {
            return false;
        }

        // Si se cumplen todas las condiciones, la línea es válida
        return true;
    }
}