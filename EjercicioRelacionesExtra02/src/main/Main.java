/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import entidades.Sala;
import java.util.Scanner;
import servicios.CineService;
import servicios.EspectadorService;
import servicios.PeliculaService;
import servicios.SalaService;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //EspectadorService ES = new EspectadorService();
        //Espectador espectador = ES.crearEspectador();

        //PeliculaService PS = new PeliculaService();
        //Pelicula pelicula = PS.crearPelicula();
        SalaService SSP = new SalaService();
        //Sala sala = SS.crearSala();
        //sala.setPelicula(pelicula);
        //SS.mostrarSala(sala);
        //SS.seleccionarAsiento(sala);
        //SS.seleccionarAsiento(sala);
        //SS.mostrarSala(sala);
        //System.out.println(espectador);
        //System.out.println(pelicula);
        //System.out.println(sala);
        CineService CS = new CineService();
        Cine cine = CS.crearCine();
        boolean salir = true;
        do {
            System.out.println("----------------");
            System.out.println("CINE");
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1-PELICULAS");
            System.out.println("2-DISPONIBILIDAD EN SALAS");
            System.out.println("3-COMPRAR TICKET");
            System.out.println("0-SALIR");
            System.out.println("----------------");
            System.out.println("Seleccione opción");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("PELICULAS");
                    for (Sala peliculas : cine.getSalas()) {
                        System.out.println(peliculas.getPelicula() + " // SALA: " + peliculas.getNombre());
                    }
                    break;
                case 2:
                    System.out.println("SALAS");
                    for (Sala sala : cine.getSalas()) {
                        System.out.println("SALA: " + sala.getNombre() + " // PRECIO: " + sala.getPrecio());
                    }
                    System.out.println("Seleccione SALA");
                    String salaSel = leer.next();
                    for (Sala sala : cine.getSalas()) {
                        if (salaSel.equalsIgnoreCase(sala.getNombre())) {
                            SSP.mostrarSala(sala);
                        }else{
                            System.out.println("La opción seleccionada no es válida");
                        }
                    }
                    break;
                case 3:
                    CS.comprarTicket(cine);
                    break;
                case 0:
                    salir = false;
                    System.out.println("Usted seleccionó SALIR");
                    break;
                default:
                    System.out.println("La opción seleccionada no es válida");
            }

        } while (salir);

    }
}
