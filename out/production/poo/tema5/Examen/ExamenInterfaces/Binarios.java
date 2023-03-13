package tema5.ExamenInterfaces;

import java.time.LocalDateTime;

public class Binarios extends FicheroP {

    private Byte[] data;

    public Binarios(String nombreFichero, LocalDateTime fechaCreacion, Byte[] data) throws FicheroException {
        super(nombreFichero, data.length, fechaCreacion);
        this.data = data;
    }

    public Byte[] getData() {
        return data;
    }

    public void setData(Byte[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Binarios";
    }

    @Override
    public String leer() {
        return null;
    }
}

