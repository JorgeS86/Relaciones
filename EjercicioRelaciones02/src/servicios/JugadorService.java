/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Jugador;
import entidades.RevolverDeAgua;

/**
 *
 * @author jorge
 */
public class JugadorService {
    
    /*Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.*/
    
    
    public Boolean disparo(RevolverDeAgua revolver, RevolverDeAguaService RAS){
        Boolean mojado = false;
        if (RAS.mojar(revolver)) {
           mojado = true;
            RAS.siguienteChorro(revolver);
        }else{
            RAS.siguienteChorro(revolver);
        }
        return mojado;
    }
}
