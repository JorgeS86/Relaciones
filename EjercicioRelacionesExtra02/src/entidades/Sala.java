/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jorge
 */
public class Sala {
    private String nombre;
    private Asiento[][] asientos;
    private Pelicula pelicula;
    private Integer precio;

    public Sala() {
    }

    public Sala(String nombre, Asiento[][] asientos, Pelicula pelicula, Integer precio) {
        this.nombre = nombre;
        this.asientos = asientos;
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Sala{" + "nombre=" + nombre + ", pelicula=" + pelicula + ", precio=" + precio + '}';
    }
    

}
