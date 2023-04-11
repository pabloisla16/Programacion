import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Liga {
    private List<Equipo> equipos;
    private String nombre;
    
    public Liga(String nombre) {
        super();
        this.equipos = new ArrayList<>();
        this.nombre = nombre;
    }

    /**
     * Añade un equipo a la liga
     * @param e
     * @throws LigaException si el equipo ya existe o no tiene jugadores
     */

    public void addEquipo(Equipo e) throws LigaException {
        if (e.getJUgadores().isEmpty()) {
            throw new LigaException("El equipo no tiene jugadores");
        }
    }
    if (ListaEquipos.contains(e)) {
        throw new LigaException("El equipo ya existe");
}
    equipos.add(e);
    }

    /**
     * Elimina un equipo de la liga
     * @param e
     * @throws LigaException si el equipo no existe
     */

    public void eliminaEquipo(Equipo e) throws LigaException {
        if (equipos.contains(e)) {
            throw new LigaException("El equipo no existe");
        }
        equipos.remove(e);
    }

    public void unirEquipos(Equipo e1, Equipo e2) throws LigaException {
        if (!equipos.contains(e1) && !equipos.contains(e2)) {
            throw new LigaException("Los equipos no existen");
        }
       return equipos.stream.filter(e1, e2) -> e1.getJugadores().addAll(e2.getJugadores());
        }
    }
    
    public List<Jugador> jugadoresEnComun(Equipo e1, Equipo e2) throws LigaException {
        
    }
    
    public double mediaEdad() throws LigaException {
        
    }
    
    public List<Jugador> jugadoresOrdenadosEdad() {
        
    }
    
    public List<Jugador> jugadoresOrdenadosNombre() {
        
    }
    
    private Set<Jugador> todosLosJugadores() {
        
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bienvenidos a " + nombre).append(System.lineSeparator());
        sb.append("Equipos: ").append(System.lineSeparator());
        for (Equipo e: equipos) {
            sb.append(e).append(System.lineSeparator());
        }
        
        return sb.toString();
        
    }
}
