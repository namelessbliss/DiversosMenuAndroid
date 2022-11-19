package com.example.proyectoandroid.semana6;


public class Fruta {

    private String nombre;
    private String descripcion;
    private int imagenBackground;
    private int icono;

    //Valores accesibles
    public static final int LIMITE_DE_CANTIDAD = 10;
    public static final int CANTIDAD_INICIAL = 0;

    public String getNombre() {
        return nombre;
    }

    public Fruta() {
    }

    public Fruta(String nombre, String descripcion, int imagenBackground, int icono) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenBackground = imagenBackground;
        this.icono = icono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagenBackground() {
        return imagenBackground;
    }

    public void setImagenBackground(int imagenBackground) {
        this.imagenBackground = imagenBackground;
    }

    public int getIcono() {
        return icono;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }
}