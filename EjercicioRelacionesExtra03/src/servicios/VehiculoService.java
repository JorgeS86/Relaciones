/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class VehiculoService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Vehiculo crearVehiculo(){
        Vehiculo vehiculoAux = new Vehiculo();
        System.out.println("Marca del Vehiculo");
        vehiculoAux.setMarca(leer.next());
        System.out.println("Modelo del Vehiculo");
        vehiculoAux.setModelo(leer.next());
        /*System.out.println("Año del Vehiculo");
        vehiculoAux.setAnio(leer.nextInt());
        System.out.println("Numero de Motor del Vehiculo");
        vehiculoAux.setNumMotor(leer.next());
        System.out.println("Numero del Chasis del Vehiculo");
        vehiculoAux.setNumChasis(leer.next());
        System.out.println("Color del Vehiculo");
        vehiculoAux.setColor(leer.next());
        System.out.println("Tipo de Vehiculo");
        vehiculoAux.setTipo(leer.next());*/
        return vehiculoAux;
    }
}
