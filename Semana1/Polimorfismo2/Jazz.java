package Semana1.Polimorfismo2;

public class Jazz extends MusicaAbs {

    public Jazz(String nombreCancion, String artista, double duracion) {
        super(nombreCancion, artista, duracion);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo la cancion: " + getNombreCancion());

    }

   /* @Override
    public void pausar() {
        System.out.println("Pausando la cancion: " + getNombreCancion());

    }

    @Override
    public void adelantar() {
        System.out.println("Adelantando la cancion: " + getNombreCancion());

    }*/
}
