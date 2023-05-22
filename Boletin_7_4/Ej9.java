package Boletin_7_4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el archivo completo y almacenarlo en una lista
        List<String> lineas = leerArchivo("notas.txt");

        try {
            FileWriter fileWriter = new FileWriter("notas.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            while (true) {
                System.out.print("Ingrese una nota para agregar (o presione enter para salir): ");
                String nuevaLinea = scanner.nextLine();

                if (nuevaLinea.isEmpty()) {
                    break;
                }

                // Añadir la nueva línea a la lista y ordenarla alfabéticamente
                lineas.add(nuevaLinea);
                Collections.sort(lineas);

                // Escribir todas las líneas en el archivo en orden alfabético
                for (String linea : lineas) {
                    printWriter.println(linea);
                }
            }

            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al escribir en el archivo.");
            e.printStackTrace();
        }
    }

    private static List<String> leerArchivo(String nombreArchivo) {
        List<String> lineas = new ArrayList<>();

        try {
            File archivo = new File(nombreArchivo);

            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                lineas.add(linea);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al leer el archivo.");
            e.printStackTrace();
        }

        return lineas;
    }
}
