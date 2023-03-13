package Recetas;

import java.util.*;

public class Recetario {

    private final HashMap<String, Receta> recetas;

    public Recetario() {
        recetas = new HashMap<String, Receta>();

    }

    public void annadirReceta(Receta nuevaReceta) throws RecetaException {
        if (recetas.containsKey(nuevaReceta.getNombreReceta())) {
            throw new RecetaException("Se ha añadido la nueva receta");
        }
    }

    public String listadoRecetasOrdenadasAlfabeticamente() throws RecetaException {
        if (recetas.isEmpty()) {
            throw new RecetaException("No hay recetas");
        } else {
            List<Receta> listaRecetas = new ArrayList<>(recetas.values());
            listaRecetas.sort(new Comparator<Receta>());
                public int (Receta o1, Receta o2) {
                    return o1.getNombreReceta().compareTo(o2.getNombre);
            }
        }

        public String listadoRecetasConIngredienteOrdenadasPorTiempoPreparacion (String ingrediente) throws
        RecetaException {
            return ingrediente;

        }
    }
}

