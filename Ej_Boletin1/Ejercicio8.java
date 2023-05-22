package Ej_Boletin1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio8 {
    public static void main(String[] args) {
        File file = new File("C:\\Usuarios\\Alumno\\Escritorio\\prueba.txt");
        if (file.exists()) {
            System.out.println("El archivo existe");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Pattern patron = Pattern.compile("^\\p{L}{2,}\\s\\p{L}{2,}\\s\\p{L}{2,}\\s[1-99]");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            boolean encontrado = false;
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = patron.matcher(line);
                if (matcher.matches()) {
                    encontrado = true;
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
