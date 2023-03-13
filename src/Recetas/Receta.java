package Recetas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Receta {
    private String nombreReceta;
    private int minutosDePreparacion;
    private HashSet<Ingrediente> ingredientes;
    private LinkedList<String> pasos;

    public Receta(String nombreReceta, int minutosPreparacion) throws RecetaException {
        this.nombreReceta = nombreReceta.toUpperCase();
        setMinutosDePreparacion(minutosPreparacion);
        ingredientes = new HashSet<Ingrediente>();
        pasos = new LinkedList<String>();
    }

    public int getMinutosDePreparacion(int minutosPreparacion) throws RecetaException {
        if (minutosPreparacion <= 0) {
            throw new RecetaException("Minutos incorrectos");
        }
        this.minutosDePreparacion = minutosPreparacion;
        return minutosPreparacion;
    }

    public void setMinutosDePreparacion(int minutosDePreparacion) throws RecetaException {
        if (minutosDePreparacion <= 0) {
            throw new RecetaException("Minutos incorrectos");
        }
        this.minutosDePreparacion = minutosDePreparacion;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void annadirPasoAlFinal(String paso) {
        pasos.add(paso.toUpperCase());
    }

    public void annadirIngrediente(Ingrediente ingredienteNuevo) {
        Iterator<Ingrediente> it = ingredientes.iterator();
        boolean ingredienteEncontrado = false;
        while (it.hasNext() && !ingredienteEncontrado) {
            Ingrediente ingredienteExistente = it.next();
            if (ingredienteExistente.equals(ingredienteNuevo)) {
                ingredienteExistente.setCantidad(ingredienteExistente.getCantidad() + ingredienteNuevo.getCantidad());
                ingredienteEncontrado = true;
            }
        }
        if (!ingredienteEncontrado) {
            ingredientes.add(ingredienteNuevo);
        }
	}

    public boolean necesitaIngrediente(String nombreIngrediente) {
        return ingredientes.contains(new Ingrediente(nombreIngrediente));
    }

    public void borrarIngrediente(Ingrediente ingredienteABorrar) throws RecetaException {
        if (!ingredientes.contains(ingredienteABorrar)) {
            throw new RecetaException ("El ingrediente a borrar no se encuentra en la lista");
        }
        else {
            for (String paso : pasos) {
                pasos.remove(paso);
            }
        }
    }
    public void annadirPasoDetrasDe(String pasoNuevo, String pasoExistente) throws RecetaException {
        int indicePasoExistente = pasos.indexOf(pasoExistente);
        if (indicePasoExistente == -1) {
            throw new RecetaException("Paso");
        }
        else {
            if(!pasoNuevo.equals(pasoExistente)){
                pasos.add(indicePasoExistente + 1, pasoNuevo.toUpperCase());
            }
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombreReceta == null) ? 0 : nombreReceta.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Receta other = (Receta) obj;
        if (nombreReceta == null) {
            if (other.nombreReceta != null)
                return false;
        } else if (!nombreReceta.equals(other.nombreReceta))
            return false;
        return false;
    }
}

