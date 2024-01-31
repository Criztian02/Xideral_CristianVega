package Semana1.Singleton;

public class Principal {
    public static void main(String[] args) {
        //creamos un "objeto" de la clase consola(singleton)
        Consola consola = Consola.getInstance();

        //creamos un objeto de tipo Videojuego, donde pasamos dos parametro uno de tipo string y otro de tipo Consola
        Videojuego game1 = new Videojuego("juego1", consola);

        //imprimimos el objeto de tipo Videojuego
        System.out.println(game1);

        //immprimimos cuantas veces se usa el objeto de tipo consola
        System.out.println(Consola.contador);
    }
}
