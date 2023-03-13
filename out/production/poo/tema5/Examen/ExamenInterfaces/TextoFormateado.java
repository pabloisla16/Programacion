package tema5.ExamenInterfaces;

import java.time.LocalDateTime;

public class TextoFormateado extends FicheroP {

    private String tipoFuente;
    private double sizeFuente;
    private String colorFuente;

    public TextoFormateado(String nombreFichero, double size, LocalDateTime fechaCreacion) throws FicheroException {
        super(nombreFichero, size, fechaCreacion);
    }

    @Override
    public String leer() {
        return null;
    }
}
