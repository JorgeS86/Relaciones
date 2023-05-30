/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Asiento;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AsientoService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Asiento crearAsiento(){
        Asiento asientoAux = new Asiento();
        asientoAux.setFila(0);
        asientoAux.setColumna(0);
        asientoAux.setOcupado(false);
        return asientoAux;
    }
}
