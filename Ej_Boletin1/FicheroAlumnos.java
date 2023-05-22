package Ej_Boletin1;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FicheroAlumnos {

    private static final String RUTA_CARPETAS = "C:\\Users\\enriq\\OneDrive\\Escritorio\\CURSOS";

    public static void main(String[] args) {
        File fichero = new File("E:\\1ºDAM\\POO JAVA\\JAVA\\UNIT 7\\BOLETIN 1\\EJ11\\src\\alumnos.txt");
        Pattern expresion = Pattern.compile("^((?:\\p{L}+\\s+)*\\p{L}+):((?:\\p{L}+\\s+)*\\p{L}+):((?:\\p{L}"
                + "+\\s+)*\\p{L}+):(\\d{4})$");
        try (
                BufferedReader br = new BufferedReader(new FileReader(fichero))
        ) {
            String l;
            while ((l = br.readLine()) != null) {
                Matcher m = expresion.matcher(l);
                if (m.find()) {
                    File ficheroCurso = new File(RUTA_CARPETAS + File.separator + m.group(4));
                    File ficheroAlumno = new File(RUTA_CARPETAS + File.separator + m.group(4) + File.separator + m.group(3));
                    if (!ficheroCurso.exists()) {
                        ficheroCurso.mkdir();
                    }
                    if (!ficheroAlumno.exists()) {
                        ficheroAlumno.mkdir();
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

        }
    }
}
