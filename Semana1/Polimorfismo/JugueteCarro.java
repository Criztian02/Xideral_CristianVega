package Semana1.Polimorfismo;

public class JugueteCarro extends Juguete implements ICarro {

    public JugueteCarro(String nombre, float precio, boolean colecionar) {

        super(nombre, precio, colecionar);
    }

    @Override
    protected void abrirJuguete() {

        System.out.println("Abrir carro " + getNombre());
    }

    @Override
    protected void jugarJuguete() {

        System.out.println("Jugar con " + getNombre() + " en la pista de carreras");
    }


    @Override
    public void carreras() {

        System.out.println("El carro " + getNombre() + " puede hacer carreras");
    }

    @Override
    public void derrapar() {

        System.out.println("El carro " + getNombre() + " puede derrapar");
    }


}
