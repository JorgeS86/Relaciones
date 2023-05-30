/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jorge
 */
public class Espectador {
    private String nombre;
    private Integer edad;
    private Double dineroDisp;

    public Espectador() {
    }

    public Espectador(String nombre, Integer edad, Double dineroDisp) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisp = dineroDisp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getDineroDisp() {
        return dineroDisp;
    }

    public void setDineroDisp(Double dineroDisp) {
        this.dineroDisp = dineroDisp;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDisp=" + dineroDisp + '}';
    }
    
    
}
