package tema5.ExamenInterfaces;
/* package
import java.time.LocalDateTime;

public abstract class FicheroP {

    private String nombreFichero;
    private LocalDateTime fechaCreacion;
    private double size;

    public FicheroP(String nombreFichero, double size, double fechaCreacion) throws FicheroException {
        super();
        this.nombreFichero = nombreFichero;
        this.size = size;
        this.fechaCreacion = fechaCreacion;
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

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public final void mostrarInformacion() {
        System.out.println("El nombre del fichero es: " + this.nombreFichero);
        System.out.println("El tamaño del fichero es: " + this.size);
        System.out.println("La fecha del fichero es: " + this.fechaCreacion);
    }

    public abstract String leer();
}
