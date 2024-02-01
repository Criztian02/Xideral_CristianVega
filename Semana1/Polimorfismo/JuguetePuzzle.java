package Semana1.Polimorfismo;

public class JuguetePuzzle extends Juguete implements IPuzzles {

    public JuguetePuzzle(String nombre, float precio, boolean colecionar) {
        super(nombre, precio, colecionar);
    }

    @Override
    protected void abrirJuguete() {
        System.out.println("Sacar " + getNombre() + " de la caja");
    }

    @Override
    protected void jugarJuguete() {
        System.out.println("Jugar con el " + getNombre());
    }

    @Override
    public void mezclar() {
        System.out.println("Mezclando el " + getNombre());
    }

    @Override
    public void resolver() {
        System.out.println("Resolviendo el " + getNombre());
    }


}
