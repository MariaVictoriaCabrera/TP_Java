package org.example;

public class Equipo {

    private String nombre;
    private String descripcion;
    private int id;

    public Equipo (int id, String nombre, String descripcion){
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
    }

    public Equipo (String nombre){
        this.nombre =nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getId() {
        return id;
    }


}
