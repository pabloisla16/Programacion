package examen_herencia;

public abstract class JugueteMadera extends Juguete { // La clase JugueteMadera hereda de juguetes

    private String origen_Madera;
    private int anotala;

    public JugueteMadera(String nombre, String marca, String origen_Madera, int anotala) {
        super(nombre, marca);
        this.anotala = anotala;
        this.origen_Madera = origen_Madera;

    }

    public String getOrigen_Madera() {
        return origen_Madera;
    }

    public void setOrigen_Madera(String origen_Madera) {
        this.origen_Madera = origen_Madera;
    }

    public int getAnotala() {
        return anotala;
    }

    public void setAnotala(int anotala) {
        this.anotala = anotala;
    }

    public void mostrarJuguetes() {

    }
}


