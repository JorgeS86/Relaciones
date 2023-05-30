/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Asiento;
import entidades.Sala;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class SalaService {

    AsientoService AS = new AsientoService();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Sala crearSala() {
        Sala salaAux = new Sala();
        System.out.println("Ingrese la Sala");
        salaAux.setNombre(leer.next());
        System.out.println("Ingrese Precio");
        salaAux.setPrecio(leer.nextInt());
        System.out.println("Defina la capacidad de asientos");
        System.out.println("Filas");
        int fila = leer.nextInt();
        System.out.println("Columnas");
        int columna = leer.nextInt();
        Asiento[][] asientos = new Asiento[fila][columna];
        for (int i = asientos.length - 1; i >= 0; i--) {
            for (int j = 0; j < asientos[i].length; j++) {
                Asiento asiento = AS.crearAsiento();
                asiento.setFila(i);
                asiento.setColumna(j);
                asiento.setOcupado(false);
                asientos[i][j] = asiento;
            }
        }
        salaAux.setAsientos(asientos);
        return salaAux;
    }

    public void mostrarSala(Sala sala) {
        for (int i = sala.getAsientos().length - 1; i >= 0; i--) {
            for (int j = 0; j < sala.getAsientos()[i].length; j++) {
                switch (j) {
                    case 0:
                        if (sala.getAsientos()[i][j].getOcupado()) {
                            System.out.print((i + 1) + "A(X)");
                        } else {
                            System.out.print((i + 1) + "A( )");
                        }
                        break;
                    case 1:
                        if (sala.getAsientos()[i][j].getOcupado()) {
                            System.out.print((i + 1) + "B(X)");
                        } else {
                            System.out.print((i + 1) + "B( )");
                        }
                        break;
                    case 2:
                        if (sala.getAsientos()[i][j].getOcupado()) {
                            System.out.print((i + 1) + "C(X)");
                        } else {
                            System.out.print((i + 1) + "C( )");
                        }
                        break;
                    case 3:
                        if (sala.getAsientos()[i][j].getOcupado()) {
                            System.out.print((i + 1) + "D(X)");
                        } else {
                            System.out.print((i + 1) + "D( )");
                        }
                        break;
                    case 4:
                        if (sala.getAsientos()[i][j].getOcupado()) {
                            System.out.print((i + 1) + "E(X)");
                        } else {
                            System.out.print((i + 1) + "E( )");
                        }
                        break;
                    case 5:
                        if (sala.getAsientos()[i][j].getOcupado()) {
                            System.out.print((i + 1) + "F(X)");
                        } else {
                            System.out.print((i + 1) + "F( )");
                        }
                        break;
                    default:
                        System.out.println("Excedió las posibilidades");
                }
            }
            System.out.println("");
        }
    }

    public void seleccionarAsiento(Sala sala) {
        System.out.println("Asientos disponibles");
        mostrarSala(sala);
        int fila;
        int columna;
        boolean confirmacion = true;
        do {
            System.out.println("Seleccione asiento(fila)");
            fila = leer.nextInt() - 1;
            System.out.println("Seleccione asiento(columna)");
            columna = leer.nextInt() - 1;
            if (sala.getAsientos()[fila][columna].getOcupado()) {
                System.out.println("ASIENTO OCUPADO");
            } else {
                confirmacion = false;
            }
        } while (confirmacion);

        for (int i = sala.getAsientos().length - 1; i >= 0; i--) {
            for (int j = 0; j < sala.getAsientos()[i].length; j++) {
                if (i == fila && j == columna) {
                    sala.getAsientos()[i][j].setOcupado(true);
                }
            }
        }
    }
}
