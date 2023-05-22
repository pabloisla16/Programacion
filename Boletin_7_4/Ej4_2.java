package Boletin_7_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ej4_2 {

    public static final int MAX_FILE_SIZE = 1024; // en bytes

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        File logFile = new File("log.txt");
        try (FileWriter writer = new FileWriter(logFile, true)) {

            while (true) {
                System.out.print("Ingrese una línea para agregar al archivo de log: ");
                String line = reader.readLine();

                writer.write(line + "\n");
                writer.flush();

                if (logFile.length() > MAX_FILE_SIZE) {
                    rotateLogFile(logFile);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void rotateLogFile(File logFile) throws IOException {
        // Obtener fecha y hora actual
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String timestamp = now.format(formatter);

        // Renombrar archivo de log con la fecha y hora actual
        String logFilename = logFile.getName();
        String rotatedFilename = logFilename.substring(0, logFilename.indexOf('.')) + "_" + timestamp + logFilename.substring(logFilename.indexOf('.'));
        File rotatedFile = new File(logFile.getParentFile(), rotatedFilename);
        logFile.renameTo(rotatedFile);

        // Crear nuevo archivo de log vacío
        logFile.createNewFile();
    }

}
