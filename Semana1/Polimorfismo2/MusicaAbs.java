package Semana1.Polimorfismo2;

public abstract class MusicaAbs implements ReproductorMusica {
    private String nombreCancion;
    private String artista;
    private double duracion;

    public MusicaAbs(String nombreCancion, String artista, double duracion) {
        this.nombreCancion = nombreCancion;
        this.artista = artista;
        this.duracion = duracion;
    }

    //getters & setters

    public String getNombreCancion() {
        return nombreCancion;
    }

    public String getArtista() {
        return artista;
    }

    public double getDuracion() {
        return duracion;
    }

    //toString
    @Override
    public String toString() {
        String mensaje = "--Datos de la cancion--" +
                "\nNombre de la cancion: " + nombreCancion +
                "\nAritsta: " + artista +
                "\nGenero Musical: "+getClass().getSimpleName()+
                "\nDuracion: " + duracion + " minutos";
        return mensaje;
    }
}
