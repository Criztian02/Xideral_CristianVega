package Semana1.Polimorfismo;

public class JuegueteBloque extends Juguete implements IBloques {

    public JuegueteBloque(String nombre, float precio, boolean colecionar) {
        super(nombre, precio, colecionar);
    }

    @Override
    protected void abrirJuguete() {
        System.out.println("abrir " + getNombre());
    }

    @Override
    protected void jugarJuguete() {
        System.out.println("Jugar con " + getNombre());
    }

    @Override
    public void armar() {
        System.out.println("Armar " + getNombre());
    }

    @Override
    public void desarmar() {
        System.out.println("Desarmar " + getNombre());
    }
}
