/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.RevolverDeAgua;
import java.util.Random;

/**
 *
 * @author jorge
 */
public class RevolverDeAguaService {
    /*Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.*/
    
    public RevolverDeAgua llenarRevolver(){
        RevolverDeAgua revolverAux = new RevolverDeAgua();
        Random aleatorio = new Random();
        revolverAux.setPosicionActual(aleatorio.nextInt(6)+1);
        revolverAux.setPosicionAgua(aleatorio.nextInt(6)+1);
        return revolverAux;
    }
    
    /*• mojar(): devuelve true si la posición del agua coincide con la posición actual*/
    
    public boolean mojar(RevolverDeAgua revolver){
        boolean mojado = false;
        if (revolver.getPosicionActual() == revolver.getPosicionAgua()) {
            mojado = true;
        }
        return mojado;
    }
    
    /*• siguienteChorro(): cambia a la siguiente posición del tambor*/
    public void siguienteChorro(RevolverDeAgua revolver){
        if (revolver.getPosicionActual()==6) {
            revolver.setPosicionActual(1);
        }else{
            revolver.setPosicionActual(revolver.getPosicionActual()+1);
        }
    }
}
