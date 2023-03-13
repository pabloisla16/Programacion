package tema5.ExamenInterfaces;

import java.time.LocalDateTime;

public abstract class Video extends Binarios implements Reproducir {


    private double duracionVideo;


    public Video(String nombreFichero, LocalDateTime fechaCreacion, Byte[] data, double duracionVideo) throws FicheroException {
        super(nombreFichero, fechaCreacion, data);
        this.duracionVideo = duracionVideo;
    }

    public double getDuracionVideo() {
        return duracionVideo;
    }

    public void setDuracionVideo(double duracionVideo) {
        this.duracionVideo = duracionVideo;
    }

    public String toString() {
        return "Video [duracionVideo=" + duracionVideo + "]";
    }

    public void reproducir() {
        System.out.println("Reproduciedo el audio:" + this.duracionVideo);
    }
}

