package Semana1.Polimorfismo;

public abstract class Juguete  {
    private String nombre;
    private float precio;
    private boolean coleccionable;
    private StringBuilder sb = new StringBuilder();

    public Juguete(String nombre, float precio, boolean colecionar) {
        this.nombre = nombre;
        this.precio = precio;
        this.coleccionable = colecionar;
    }

    protected abstract void abrirJuguete();

    protected abstract void jugarJuguete();

    //getters & setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isColeccionable() {
        return coleccionable;
    }

    public void setColeccionable(boolean coleccionable) {
        this.coleccionable = coleccionable;
    }

    @Override
    public String toString() {
        String mensaje = "Juguete: " + nombre +
                "\nPrecio: $" + precio;
        if (coleccionable) {
            mensaje += "\nEs coleccionable";
        } else {
            mensaje += "\nNo es coleccionable";
        }
        return mensaje;
    }
}
