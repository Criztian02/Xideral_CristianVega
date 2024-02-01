package Semana1.Polimorfismo;

import java.util.*;

public class Principal {
    public static void main(String[] args) {

        Juguete lego = new JuegueteBloque("Lego", 12.3f, true);
        Juguete hotWheels = new JugueteCarro("Hot Wheels", 20.1f, false);
        Juguete rubic = new JuegueteBloque("Cubo Rubic", 25.3f, false);
        List<Juguete> listaJuguetes = new ArrayList<>();
        listaJuguetes.add(lego);
        listaJuguetes.add(hotWheels);
        listaJuguetes.add(rubic);

        mostrar(listaJuguetes);
    }

    public static void mostrar(List<Juguete> juguete) {

        for (Juguete juguetes : juguete) {
            System.out.println(juguetes);
            juguetes.abrirJuguete();
            juguetes.jugarJuguete();

            if (juguetes instanceof JuegueteBloque) {
                JuegueteBloque bloque = (JuegueteBloque) juguetes;
                bloque.armar();
                bloque.desarmar();
            } else if (juguetes instanceof JugueteCarro) {
                JugueteCarro carro = (JugueteCarro) juguetes;
                carro.carreras();
                carro.derrapar();
            } else if (juguetes instanceof JuguetePuzzle) {
                JuguetePuzzle puzzle = (JuguetePuzzle) juguetes;
                puzzle.mezclar();
                puzzle.resolver();
            }

            System.out.println("\n");
        }


    }
}
