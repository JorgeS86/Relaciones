/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Empleado;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class EmpleadoServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Empleado crearEmpleado(){
        System.out.println("Ingrese Datos del empleado:");
        Empleado empleadoAux = new Empleado();
        System.out.println("Nombre:");
        empleadoAux.setNombre(leer.next());
        System.out.println("Apellido:");
        empleadoAux.setApellido(leer.next());
        System.out.println("Edad");
        empleadoAux.setEdad(leer.nextInt());
        return empleadoAux;
    }
}
