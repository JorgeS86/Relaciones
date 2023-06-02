/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidades.Cliente;
import entidades.Poliza;
import entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.ClienteService;
import servicios.CuotaService;
import servicios.PolizaService;
import servicios.VehiculoService;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<Poliza> polizas = new ArrayList();
        PolizaService PS = new PolizaService();
        boolean salir = true;
        do {
            Poliza poliza = PS.crearPoliza();
            polizas.add(poliza);
            System.out.println("Desea agregar otra poliza?");
            if (leer.next().equalsIgnoreCase("N")) {
                salir = false;
            }
        } while (salir);
        System.out.println(polizas);
        CuotaService CuotaS = new CuotaService();
        System.out.println("Seleccione una Póliza");
        int polizaSel = leer.nextInt();
        for (Poliza polizasList : polizas) {
            if (polizaSel==polizasList.getNumPoliza()) {
                CuotaS.calcularCuotas(polizasList);
            }
        }
        System.out.println(polizas);
    }
    
}
