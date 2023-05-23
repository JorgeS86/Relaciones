/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jorge
 */
public class Empleado {
    
    private String Nombre;
    private String Apellido;
    private Integer edad;

    public Empleado() {
    }

    public Empleado(String Nombre, String Apellido, Integer edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", edad=" + edad + '}';
    }
    
}
