/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import servicios.JugadorService;
import servicios.RevolverDeAguaService;

/**
 *
 * @author jorge
 */
public class Juego {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver*/
    ArrayList<Jugador> jugadores = new ArrayList();
    JugadorService JS = new JugadorService();
    RevolverDeAguaService RAS = new RevolverDeAguaService();
    RevolverDeAgua revolver = RAS.llenarRevolver();

    /*Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.*/
    public void llenarJuego() {
        System.out.println("Ingrese la cantidad de jugadores (6 máx.): ");
        int cantJugadores = leer.nextInt();
        if (cantJugadores <= 6) {
            for (int i = 0; i < cantJugadores; i++) {
                Jugador jugador = new Jugador();
                jugador.setID(i +1);
                jugador.setNombre("Jugador " + jugador.getID());
                jugador.setMojado(JS.disparo(revolver, RAS));
                jugadores.add(jugador);
            }
        } else {
            System.out.println("Usted Ingreso una cantidad no válida");
            System.out.println("Por defecto se cargarán 6 Jugadores");
            for (int i = 0; i < 6; i++) {
                Jugador jugador = new Jugador();
                jugador.setID(i + 1);
                jugador.setNombre("Jugador " + jugador.getID());
                jugador.setMojado(JS.disparo(revolver, RAS));
                jugadores.add(jugador);
            }
        }
    }

    /*ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.*/
    public void ronda() {

        System.out.println("----------------");
        System.out.println("Juego RULETA RUSA");
        System.out.println("----------------");
        boolean salir = true;
        do {
             for (Jugador jugador : jugadores) {
                 System.out.println(jugador);
                    if (jugador.getMojado() == false) {
                        System.out.println("El " + jugador.getNombre() + " no se mojó");
                        System.out.println("SIGUIENTE JUGADOR");
                        System.out.println("----------------");
                        
                    } else {
                        System.out.println("El " + jugador.getNombre() + " se mojó");
                        System.out.println(jugador.getNombre() + " Queda ELIMINADO");
                        System.out.println("----------------");
                        //jugadores.remove(jugador);
                        salir = false;
                        break;
                    }
                    jugador.setMojado(JS.disparo(revolver, RAS));
                }
        } while (salir);
    }
}
