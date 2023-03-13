package tema5.ExamenInterfaces;

import java.time.LocalDateTime;
import java.util.Arrays;
public class Audio extends Binarios {
    private int duracionAudio;

    public Audio(String nombreFichero, LocalDateTime fechaCreacion, Byte[] data, int duracionAudio) throws FicheroException {
        super(nombreFichero, fechaCreacion, data);
        this.duracionAudio = duracionAudio;
    }

    public int getDuracionAudio() {
        return duracionAudio;
    }

    public void setDuracionAudio(int duracionAudio) {
        this.duracionAudio = duracionAudio;
    }

    @Override
    public String toString() {
        return "Audio [data=" + Arrays.toString(getData()) + ", duracionAudio=}";
    }


    public String reproducir() {
        String reproducir;
        reproducir = "Reproducir el audio: " + this.getNombreFichero();

        return reproducir;
    }
}


