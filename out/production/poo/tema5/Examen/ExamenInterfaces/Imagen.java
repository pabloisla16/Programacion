package tema5.ExamenInterfaces;

import java.time.LocalDateTime;

public class Imagen extends Binarios {
    private String formato;
    public Imagen(String nombreFichero, LocalDateTime fechaCreacion, Byte[] data, String formato) throws FicheroException {
        super(nombreFichero, fechaCreacion, data);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
