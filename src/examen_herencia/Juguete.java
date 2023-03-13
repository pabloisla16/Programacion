package examen_herencia;

public abstract class Juguete {
    private String nombre, marca; //Creamos un String de nombre, y marca de los juguetes

    public Juguete(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    public String getNombre() { //Getters
        return nombre;
    }

    public void setNombre(String nombre) { //Setters
        this.nombre = nombre;
    }

    public String getMarca() { //Getters
        return marca;
    }

    public void setMarca(String marca) { //Setters
        this.marca = marca;
    }

    public void mostrarJuguete() {

    }
}


