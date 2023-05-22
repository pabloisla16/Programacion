package examen_herencia;

public class FiguraMadera extends JugueteMadera implements IApilable {
    private String color_Figura;
    private int num_lados;

    public FiguraMadera(String nombre, String marca, String origen_Madera, int anotala, String color_Figura, int num_lados) {
        super(nombre, marca, origen_Madera, anotala);
        this.color_Figura = color_Figura;
        this.num_lados = num_lados;
    }

    public static void addJuguete(FiguraMadera j1) {
    }

    public String getColor_Figura() {
        return color_Figura;
    }

    public void setColor_Figura(String color_Figura) {
        this.color_Figura = color_Figura;
    }

    public int getNum_lados() {
        return num_lados;
    }

    public void setNum_lados(int num_lados) throws JuegoException {
        if (num_lados > 1) {
            throw new JuegoException("La figura debe de tener al menos un lado");
        }
        this.num_lados = num_lados;
    }

    public void apilar() {

    }


}




