/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jorge
 */
public class Pelicula {
    private String titulo;
    private Integer duracion;
    private Integer edadMin;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, Integer duracion, Integer edadMin, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMin = edadMin;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(Integer edadMin) {
        this.edadMin = edadMin;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula: " + titulo + "// Duracion: " + duracion + "// Edad Minima: " + edadMin + "// Director: " + director;
        //return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edadMin=" + edadMin + ", director=" + director + '}';
    }
    
    
}
