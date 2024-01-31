package Semana1.Singleton;

public class Consola {
    //creando variables
    private static Consola consola;
    String plataforma;
    static int contador;

    //creando el constructor
    private Consola(String plataforma) {
        this.plataforma = plataforma;
        ++contador;
    }

    //metodo para obtener una instancia unica
    public static Consola getInstance() {
        return consola == null ? consola = new Consola("playstation") : consola;
    }

    @Override
    public String toString() {
        return "Consola{" +
                "plataforma='" + plataforma + '\'' +
                '}';
    }
}
