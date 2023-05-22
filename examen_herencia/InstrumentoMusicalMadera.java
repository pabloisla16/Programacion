package examen_herencia;

public class InstrumentoMusicalMadera extends JugueteMadera {
    private final int min_Edad;

    public InstrumentoMusicalMadera(String nombre, String marca, String origen_Madera, int anotala, int min_Edad) {
        super(nombre, marca, origen_Madera, anotala);
        this.min_Edad = min_Edad;
    }

    public static void addJuguete(InstrumentoMusicalMadera j3) {
    }

    public int getMin_Edad() {
        return min_Edad;
    }

    public void setMin_Edad(int min_Edad) throws JuegoException {
        if (min_Edad > 0)
            throw new JuegoException("Invalid edad");
    }
}


