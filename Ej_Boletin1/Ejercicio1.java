package Ej_Boletin1;

import java.io.*;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        BufferedReader contar = null;
        int contadorLineas = 0;
        // Este try captura los errores que puede dar al contar el numero de lines que tiene.
        try {
            //Inicilizamos el contar con un BufferedReader.
            contar = new BufferedReader(new FileReader("contar.txt"));
            /*
            Minetras contar tenga lineas que contar nos ira sumando 1 al contador.
             */
            while (contar.readLine() != null) {
                contadorLineas++;
            }
            //Hacemos un println para que nos muestre cuantos lineas ha contado.
            System.out.println("El fichero tiene : " + contadorLineas);
            // Y con finally para finalizar el contador de la cadena.
        }
        // Si hay un error, mostrarlo
        catch (IOException e) {
            System.out.println("Error al contar las lineas: " + e.getMessage());
        } finally {
            if (contar != null) {
                contar.close();
            }
        }
    }
}
