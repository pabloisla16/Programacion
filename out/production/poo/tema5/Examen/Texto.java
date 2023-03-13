package tema5.ExamenInterfaces;

import java.time.LocalDateTime;

public class Texto extends FicheroP {

    private String[] parrafo;

    public Texto(String nombreFichero, double size, LocalDateTime fechaCreacion) throws FicheroException {
        super(nombreFichero, size, fechaCreacion);

    }
}


