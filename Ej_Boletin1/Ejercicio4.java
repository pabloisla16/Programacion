package Ej_Boletin1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class Ejercicio4 {
    public static void main(String[] args) {
        try (BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in))) {
            String linea;
            while (!(linea = teclado.readLine()).equals("fin")) {

                Path path = Paths.get("salidaEj3.txt");

                Files.write(path, linea.getBytes(), StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}