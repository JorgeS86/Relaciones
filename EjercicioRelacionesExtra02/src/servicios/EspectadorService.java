/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Espectador;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class EspectadorService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Espectador crearEspectador(){
    Espectador espectadorAux = new Espectador();
        System.out.println("---------------");
        System.out.println("Ingrese Nombre del Espectador");
        espectadorAux.setNombre(leer.next());
        System.out.println("Ingrese Edad");
        espectadorAux.setEdad(leer.nextInt());
        System.out.println("Ingrese Dinero Disponible");
        espectadorAux.setDineroDisp(leer.nextDouble());
        System.out.println("---------------");
    return espectadorAux;
    }
}
