package tema5.ExamenInterfaces;

import java.time.LocalDateTime;

public class Binarios extends FicheroP {

    private byte[] data;


    public Binarios(String nombreFichero, double size, LocalDateTime fechaCreacion) throws FicheroException {
        super(nombreFichero, size, fechaCreacion);
    }
}

