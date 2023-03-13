package tema5.ExamenInterfaces;

public class TextoPlano extends Texto implements Representable {

    public TextoPlano(String nombreFichero, double fechaCreacion, String[] parrafo) throws FicheroException {
        super(nombreFichero, fechaCreacion, parrafo);
    }

    @Override
    public void representar() {
        for (int i = 0; i < parrafo.length; i++) {
            System.out.println(parrafo[i]);
        }
    }
}
