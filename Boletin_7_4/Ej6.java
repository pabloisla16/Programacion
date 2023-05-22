package Boletin_7_4;

import java.io.*;

public class Ej6 {
    private static final int MAX_SIZE = 1024; // tamaño máximo en bytes de la bitácora

    public static void main(String[] args) {
        try {
            // Abrir el archivo en modo "append" (añadir al final)
            FileWriter fw = new FileWriter("bitacora.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            while (true) {
                // Leer la línea desde el teclado
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String linea = br.readLine();

                // Obtener el tamaño actual del archivo
                File archivo = new File("bitacora.txt");
                long tamanno = archivo.length();

                // Si el archivo supera el tamaño máximo, borrar la primera línea
                if (tamanno >= MAX_SIZE) {
                    BufferedReader br2 = new BufferedReader(new FileReader("bitacora.txt"));
                    String primeraLinea = br2.readLine();
                    br2.close();

                    BufferedWriter bw2 = new BufferedWriter(new FileWriter("bitacora.txt"));
                    bw2.write(linea);
                    bw2.newLine();
                    String linea2;
                    while ((linea2 = br2.readLine()) != null) {
                        bw2.write(linea2);
                        bw2.newLine();
                    }
                    bw2.close();
                } else {
                    // Añadir la línea al final del archivo
                    bw.write(linea);
                    bw.newLine();
                }

                bw.flush(); // Vaciar el buffer de escritura
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}