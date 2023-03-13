package tema5.ExamenInterfaces;

import java.util.Arrays;

public abstract class Texto extends FicheroP {

    String[] parrafo;

    public Texto(String nombreFichero, double fechaCreacion, String[] parrafo) throws FicheroException {
        super(nombreFichero, sizeT(parrafo), fechaCreacion);
        this.parrafo = parrafo;
    }

    public String[] getParrafo() {
        return parrafo;
    }

    public void setParrafo(String[] parrafo) {
        this.parrafo = parrafo;

    }

    private static double sizeT(String[] parrafo) {
        double acum = 0;
        //For extendido:
        for (String nombreFichero : parrafo) {
            acum += nombreFichero.length();

        }
        return acum;
        //Flujo de datos(ignorar de momento)
        // return.Arrays.stream(parrafo).reduce(String::concat).get().length();
    }

    @Override
    public String toString() {
        return "Texto [parrafo=" + Arrays.toString(parrafo) + "]";
    }
    @Override
    public String leer() {
        StringBuilder sb = new StringBuilder();
        for (String s : parrafo){
            sb.append(s);
        }
        return sb.toString();
    }
}


