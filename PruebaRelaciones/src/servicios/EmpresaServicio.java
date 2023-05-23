/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Empleado;
import entidades.Empresa;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class EmpresaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EmpleadoServicio EmpServ = new EmpleadoServicio();
    
    public void crearEmpresa(Empresa empresa){
        System.out.println("Empresa:");
        empresa.setNombre(leer.next());
        ArrayList<Empleado> empleados = new ArrayList();
        boolean salir = true;
        do {
            Empleado empleado = EmpServ.crearEmpleado();
            empleados.add(empleado);
            System.out.println("Desea sumar otro empleado?");
            if (leer.next().equalsIgnoreCase("n")) {
                salir = false;
            }
        } while (salir);
        empresa.setEmpleados(empleados);
    }
}
