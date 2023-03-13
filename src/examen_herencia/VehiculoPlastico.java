package examen_herencia;

public class VehiculoPlastico extends JueguetePlastico {
    private int num_ruedas;

    public VehiculoPlastico(String nombre, String marca, int num_ruedas) {
        super(nombre, marca);
        this.num_ruedas = num_ruedas;
    }

    public int getNum_ruedas() {
        return num_ruedas;
    }

    public void setNum_ruedas(int num_ruedas) throws JuegoException {
        if (num_ruedas > 0) {
            throw new JuegoException("Invalid");
        }
        this.num_ruedas = num_ruedas;
    }

    public static void addJuguete(VehiculoPlastico j4) {
        Juguete juguete = null;

        Juguete[] juguetes = new Juguete[9];

        for (int i = 0; i < juguetes.length; i++) {
            if (juguetes[i] == null) {
                juguetes[i] = null;
            }
        }

    }
}