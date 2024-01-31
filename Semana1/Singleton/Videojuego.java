package Semana1.Singleton;

public class Videojuego {
    //variables de la clase
    private String nombre;
    private Consola consola;

    //constructor que recibe un string y un dato de tipo consola
    public Videojuego(String nombre, Consola consola) {
        this.nombre = nombre;
        this.consola = consola;
    }

    //sobreescribimos el metodo to String para que muestre los datos
    @Override
    public String toString() {
        return "Videojuego{" +
                "nombre='" + nombre + '\'' +
                ", " + consola +
                '}';
    }
}
