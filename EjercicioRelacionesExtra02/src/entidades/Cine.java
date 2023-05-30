/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class Cine {
    private String nombre;
    private ArrayList<Sala> salas;
    private Espectador espectador;

    public Cine() {
    }

    public Cine(String nombre, ArrayList<Sala> salas, Espectador espectador) {
        this.nombre = nombre;
        this.salas = salas;
        this.espectador = espectador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Cine{" + "nombre=" + nombre + ", salas=" + salas + '}';
    }
    
}
