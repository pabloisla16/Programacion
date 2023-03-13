package tema5.ExamenInterfaces;

import java.time.LocalDateTime;

public class TextoPlanoImpl extends TextoPlano {
    public TextoPlanoImpl(String nombreFichero, double size, LocalDateTime fechaCreacion) throws FicheroException {
        super(nombreFichero, size, fechaCreacion);
    }
}
