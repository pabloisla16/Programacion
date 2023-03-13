package examen_herencia;

public class PiezaLego extends JueguetePlastico implements IApilable {
    private int longitud;
    private String color;

    public PiezaLego(String nombre, String marca, int longitud, String color) {
        super(nombre, marca);
        this.longitud = longitud;
        this.color = color;

    }

    public static void addJuguete(PiezaLego j6) {
    }


    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) throws JuegoException {
        if (longitud < 0) {
            throw new JuegoException("Invalid longuitud");
        }

        this.longitud = longitud;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void apilar(Juguete juguete1) throws JuegoException {
        if (juguete1 instanceof PiezaLego) {
            System.out.println("Apilar: " + juguete1);
        } else {
            throw new JuegoException ("Este jueguete no es un apilable");

        }
    }

    @Override
    public void apilar() {

    }
}

