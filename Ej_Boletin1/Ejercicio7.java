package Ej_Boletin1;

import java.io.File;
import java.util.Scanner;

public class Ejercicio7 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("MENÚ DE OPCIONES");
            System.out.println("1. Listar directorio");
            System.out.println("2. Listar directorio y buscar ficheros que comiencen por una palabra");
            System.out.println("3. Listar archivos con cierta extensión de un directorio");
            System.out.println("4. Buscar un archivo en un directorio");
            System.out.println("5. Buscar recursivamente un archivo en un directorio");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> listarDirectorio();
                case 2 -> listarDirectorioComienzanCon();
                case 3 -> listarDirectorioPorExtension();
                case 4 -> buscarArchivoEnDirectorio();
                case 5 -> buscarArchivoRecursivamente(new File("C:\\Users\\Usuario\\Desktop\\prueba"), "prueba.txt", 0);
                case 6 -> System.out.println("Saliendo..");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 6);
        sc.close();
    }

    private static void listarDirectorio() {
        /*
         * Pedir al usuario que introduzca el nombre del directorio
         * Comprobar que existe
         * Comprobar que es un directorio
         * Comprobar que tiene permisos de lectura
         * Listar los archivos que contiene
         * Mostrar el nombre y el tamaño de cada archivo
         * Si no tiene permisos de lectura, mostrar un mensaje
         * Si no es un directorio, mostrar un mensaje
         * Si no existe, mostrar un mensaje
         */
        System.out.print("Introduzca el nombre del directorio: ");
        String nombreDirectorio = sc.nextLine();
        System.out.println("Introduce el comienzo de los ficheros");
        String palabra = sc.nextLine();
        File directorio = new File(nombreDirectorio);
        if (directorio.exists()) {
            if (directorio.isDirectory()) {
                if (directorio.canRead()) {
                    File[] files = directorio.listFiles((dir, name) -> name.startsWith(palabra));
                    if (files != null) {
                        for (File file : files) {
                            if (file.isFile()) {
                                System.out.println(file.getName() + " " + (double) file.length() / 1024 + " KB");
                            } else if (file.isDirectory()) {
                                System.out.println(file.getName() + " (Directorio)");
                            }
                        }
                    }

                } else {
                    System.out.println("No tiene permisos de lectura");
                }
            } else {
                System.out.println("El nombre introducido no es un directorio");
            }
        } else {
            System.out.println("El directorio no existe");
        }
    }

    private static void listarDirectorioComienzanCon() {
    }

    private static void listarDirectorioPorExtension() {
    }

    private static void buscarArchivoEnDirectorio() {
        System.out.println("Introduce el nombre del directorio:");
        String nombre = sc.nextLine();
        System.out.println("Introduce la extension del fichero:");
        String extension = sc.nextLine();
        File directorio = new File(nombre);
        if (directorio.exists()) {
            if (directorio.isDirectory()) {
                if (directorio.canRead()) {
                    File[] files = directorio.listFiles();
                    if (files != null) {
                        for (File file : files) {
                            if (file.getName().equals(extension)) {
                                if (file.isFile()) {
                                    System.out.println(file.getName() + " " + (double) file.length() / 1024 + " KB");
                                } else if (file.isDirectory()) {
                                    System.out.println(file.getName() + " es un directorio o una ruta absoluta");
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("El directorio no tiene permisos de lectura");
                }
            } else {
                System.out.println("No se encuentra el directorio con el nombre especificado");
            }
        } else {
            System.out.println("El directorio no existe");
        }
    }

    private static void buscarArchivoRecursivamente(File directorio, String nombre, int repetido) {
        int repetidos2 = repetido;
        File[] files = directorio.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.getName().equals(nombre) && file.isFile()) {
                    System.out.println(file.getAbsolutePath());
                    repetidos2++;
                }
                if (file.isDirectory()) {
                    buscarArchivoRecursivamente(file, nombre, repetidos2);
                }
            }
        }
    }
}


