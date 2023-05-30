/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import entidades.Sala;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class CineService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EspectadorService ES = new EspectadorService();
    PeliculaService PS = new PeliculaService();
    SalaService SS = new SalaService();

    public Cine crearCine() {
        System.out.println("CINE GEORGE");
        Cine cineAux = new Cine();
        cineAux.setNombre("GEORGE");
        ArrayList<Sala> salasAux = new ArrayList();
        boolean salir = true;
        do {
            Sala sala = SS.crearSala();
            Pelicula pelicula = PS.crearPelicula();
            sala.setPelicula(pelicula);
            System.out.println(sala);
            SS.mostrarSala(sala);
            salasAux.add(sala);
            System.out.println("Desea agregar otra Sala (S/N)?");
            if (leer.next().equalsIgnoreCase("N")) {
                salir = false;
            }
            cineAux.setSalas(salasAux);
        } while (salir);
        return cineAux;
    }

    public void comprarTicket(Cine cine) {
        Espectador espectador = ES.crearEspectador();
        System.out.println("Salas Disponibles");
        System.out.println(cine);
        boolean salir = true;
        do {
            System.out.println("Seleccione Sala");
            String salaSeleccionada = leer.next();
            for (Sala salas : cine.getSalas()) {
                if (salas.getNombre().equalsIgnoreCase(salaSeleccionada)) {
                    if (espectador.getDineroDisp() >= salas.getPrecio()) {
                        if (espectador.getEdad() >= salas.getPelicula().getEdadMin()) {
                            SS.seleccionarAsiento(salas);
                            SS.mostrarSala(salas);
                        } else {
                            System.out.println("NO CUMPLE CON LA EDAD PERMITIDA");
                            System.out.println("Desea elegir otra sala?(S/N)");
                            if (leer.next().equalsIgnoreCase("N")) {
                                salir = false;
                            }
                        }
                    } else {
                        System.out.println("DINERO INSUFICIENTE");
                        System.out.println("Desea elegir otra sala?(S/N)");
                        if (leer.next().equalsIgnoreCase("N")) {
                            salir = false;
                        }
                    }
                }
            }
        } while (salir);

    }
}
