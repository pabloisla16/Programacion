package Ej_Boletin1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre del directorio:");
        String nombre = teclado.nextLine();
        File directorio = new File(nombre);
        if (directorio.exists()) {
            if(directorio.isDirectory()) {
                File[] files = directorio.listFiles();
                for (File file : files) {
                    System.out.println(file.getName());
                }
            }
        }

    }
    public static void mostrarContenidos(String nombre) throws IOException {
        System.out.println("Introduce el nombre del directorio:");
        Scanner teclado;
        File directorio = new File(nombre);
        if (directorio.exists()) {
            if(directorio.isDirectory()) {
                File[] files = directorio.listFiles();

                }
            }
        }
    }