package org.example;

import java.util.Objects;

public class UsuarioDTO {

    private long id;
    private String nombre;

    public UsuarioDTO(Long id, String nombre) {
        this.id=id;
        this.nombre=nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(this==null || getClass() != obj.getClass()) return false;
        UsuarioDTO that = (UsuarioDTO) obj;
        return Objects.equals(id, that.id)&&Objects.equals(nombre,that.nombre);
    }
}
