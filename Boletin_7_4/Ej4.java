package Boletin_7_4;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ej4 {

    public static final int MAX_FILE_SIZE = 1024; // en bytes

    public static void main(String[] args) throws IOException {
        String carpeta = "C:\\proyecto\\Boletines\\POO\\Boletin_7_4\\Ej4";
        File fichero = new File(carpeta + "\\fichero.txt");
        FileWriter fw = null;

        try {
            fw = new FileWriter(fichero);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter ficherodestino = new PrintWriter(new FileWriter(fichero, true))) {
            String l;
            // Mientras no se escriba "exit" en la consola, se escribe en el archivo de log
            // y se comprueba si se ha superado el tamaño máximo del archivo
            // Si se ha superado, se renombra el archivo de log y se crea uno nuevo
            // con el mismo nombre

            while (!(l = reader.readLine()).equals("fin")) {
                // Escribir en el archivo de log
                ficherodestino.println(l);
                ficherodestino.flush();
                ficherodestino.close();

                // Comprobar tamaño del archivo de log
                if (fichero.length() >= MAX_FILE_SIZE) {

                    // Renombrar archivo de log y crear uno nuevo
                   String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss"));

                    //if (!File.renameTo(new File(fichero + timestamp + ".txt")))
                        System.out.println("El fichero no pudo ser renombrado");
                    //else {
                        System.out.println("El fichero ha sido renombrado satisfactoriamente");
                    }
                    // Crear nuevo fichero
                    File nuevoFichero = new File (fichero + ".txt");
                    nuevoFichero.createNewFile();

                    // Redireccionar la salida estándar al nuevo fichero
                    fw = new FileWriter(nuevoFichero);

                }
            }
        //} catch (IOException e) {
           // e.printStackTrace();
        }
    }