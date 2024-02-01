package Semana1.Polimorfismo2;

import java.util.*;
public class Principal2 {
    public static void main(String[] args) {
        ReproductorMusica cancion1 = new Electronica("Save the World", "S H M", 3.36);
        ReproductorMusica cancion2 = new Jazz("Rivers in the Desert", "Lyn", 5.16);

        List<ReproductorMusica> listaReproduccion = new ArrayList<>();
        listaReproduccion.add(cancion1);
        listaReproduccion.add(cancion2);

        reproducir(listaReproduccion);

    }

    public static void reproducir(List<ReproductorMusica> reproduccion) {
        for (ReproductorMusica lista : reproduccion) {
            System.out.println(lista);
            lista.reproducir();
            System.out.println();
        }
    }
}
