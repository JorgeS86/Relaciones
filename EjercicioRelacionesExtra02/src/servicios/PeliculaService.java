/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Pelicula;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class PeliculaService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pelicula crearPelicula(){
        Pelicula peliculaAux = new Pelicula();
        System.out.println("---------------");
        System.out.println("Ingrese el Titulo de la Pelicula");
        peliculaAux.setTitulo(leer.next());
        System.out.println("Ingrese la duración de la Pelicula (min)");
        peliculaAux.setDuracion(leer.nextInt());
        System.out.println("Ingrese la edad mínima");
        peliculaAux.setEdadMin(leer.nextInt());
        System.out.println("Ingrese el nombre del Director");
        peliculaAux.setDirector(leer.next());
        System.out.println("---------------");
        return peliculaAux;
    }
}
