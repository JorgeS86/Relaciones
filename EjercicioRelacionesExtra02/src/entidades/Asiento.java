/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jorge
 */
public class Asiento {
    private Integer fila;
    private Integer columna;
    private Boolean ocupado;
    private Espectador espectador;

    public Asiento() {
    }

    public Asiento(Integer fila, Integer columna, Boolean ocupado, Espectador espectador) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = ocupado;
        this.espectador = espectador;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public Integer getColumna() {
        return columna;
    }

    public void setColumna(Integer columna) {
        this.columna = columna;
    }

    public Boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Asiento{" + "fila=" + fila + ", columna=" + columna + ", ocupado=" + ocupado + ", espectador=" + espectador + '}';
    }
    
}
