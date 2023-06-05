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
        CuotaService CuotaS = new CuotaService();
        int contNumPol = 1;
        boolean salirMenu = true;

        do {
            System.out.println("----------------");
            System.out.println("MENU ASEGURADORA");
            System.out.println("----------------");
            System.out.println("1-Nueva Poliza");
            System.out.println("2-Consultar Poliza");
            System.out.println("3-Borrar Poliza");
            System.out.println("0-Salir");
            System.out.println("----------------");
            System.out.println("Seleccione opción deseada:");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Poliza nro: " + contNumPol);
                    Poliza poliza = PS.crearPoliza();
                    poliza.setNumPoliza(contNumPol);
                    contNumPol++;
                    polizas.add(poliza);

                    /*for (Poliza polizasList : polizas) {
                        CuotaS.calcularCuotas(polizasList);
                    }*/
                    break;
                case 2:
                    if (polizas.isEmpty()) {
                        System.out.println("No hay polizas para mostrar");
                    } else {
                        System.out.println(polizas);
                        System.out.println("Desea Informar un Pago?(S/N)");
                        if (leer.next().equalsIgnoreCase("S")) {
                            System.out.println("Seleccione una Póliza");
                            int polizaSel = leer.nextInt();
                            for (Poliza polizasList : polizas) {
                                if (polizaSel == polizasList.getNumPoliza()) {
                                    CuotaS.calcularCuotas(polizasList);
                                }
                            }
                        }
                    }

        break;
                case 3:
                    System.out.println(polizas);
                    System.out.println("Seleccione una Póliza a Borrar");
                    int polizaBorrar = leer.nextInt();
                    for (Poliza polizasList : polizas) {
                        if (polizaBorrar == polizasList.getNumPoliza()) {
                            polizas.remove(polizasList);
                            break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Usted ha seleccionado SALIR");
                    salirMenu = false;
                    break;
                default:
                    System.out.println("La opción seleccionada no es VALIDA");
            }
        } while (salirMenu);

    }

}
