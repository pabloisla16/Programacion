package Ej_Boletin1;

import java.io.*;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        BufferedReader lectura = null;
        PrintWriter escritura = null;
        StringBuilder sb = new StringBuilder();
        try {
            lectura = new BufferedReader(new FileReader("entrada1.txt"));
            escritura = new PrintWriter(new FileWriter("salida1.txt"));
            String l;
            while ((l = lectura.readLine()) != null) {
                // Añade a la fila que lee al StingBuilder.
                escritura.println(l);
                // Añade un espacio.
                sb.append(l).append(" ");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (lectura != null) {
                lectura.close();
            }
            if (escritura != null) {
                escritura.close();
            }
            System.out.println(sb);
        }
    }
}
