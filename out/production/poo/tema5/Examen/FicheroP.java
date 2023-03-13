package tema5.ExamenInterfaces;

import java.time.LocalDateTime;

public class FicheroP {

    private String nombreFichero;
    private LocalDateTime fechaCreacion;
    private double size;

    public FicheroP(String nombreFichero, double size, LocalDateTime fechaCreacion) throws FicheroException {
        this.nombreFichero = nombreFichero;
        setSize(size);
    }

    public double getSize() {

        return size;
    }

    public void setSize(double size) throws FicheroException {
        if(size < 0){
            throw new FicheroException("Invalid size");
        }
        this.size = size;
    }

    public String getNombreFichero() {
        return nombreFichero;
    }

    public void setNombreFichero(String nombreFichero) throws FicheroException {
        if(nombreFichero == null || nombreFichero.trim().isEmpty()){
            throw new FicheroException("Invalid nombre");
        }
        this.nombreFichero = nombreFichero;
    }
}
