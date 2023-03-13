package tema5.ExamenInterfaces;

import java.time.LocalDateTime;

public class TextoPlano extends FicheroP implements Texto  {
    public TextoPlano(String nombreFichero, double size, LocalDateTime fechaCreacion) throws FicheroException {
        super(nombreFichero, size, fechaCreacion);
    }

}
