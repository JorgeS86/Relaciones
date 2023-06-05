/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Cuota;
import entidades.Poliza;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class CuotaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Cuota> calcularCuotasPoliza(Poliza polizaAux) {
        ArrayList<Cuota> cuotas = new ArrayList();

        for (int i = 0; i < polizaAux.getCuotas(); i++) {
            Cuota cuota = new Cuota();
            cuota.setNroCuota(i+1);
            System.out.println("Cuota nro. : " + cuota.getNroCuota());
            cuota.setMontoTotal(polizaAux.getMontoTotal() / polizaAux.getCuotas());
            System.out.println("Valor de la cuota: " + cuota.getMontoTotal());
            System.out.println("La cuota está paga? (S/N)");
            if (leer.next().equalsIgnoreCase("S")) {
                cuota.setCuotaPaga(true);
            } else {
                cuota.setCuotaPaga(false);
            }
            int diaVenc = polizaAux.getFechaInicio().getDate();
            int mesVenc = polizaAux.getFechaInicio().getMonth() + (i + 1);
            int anioVenc = polizaAux.getFechaInicio().getYear();
            Date fechaV = new Date(anioVenc, mesVenc, diaVenc);
            cuota.setFechaVencimiento(fechaV);
            System.out.println("Fecha de Vencimiento: " + cuota.getFechaVencimiento());
            cuota.setFormaPago(polizaAux.getFormaPago());
            cuotas.add(cuota);
        }
        return cuotas;
    }

    public void calcularCuotas(Poliza poliza) {
        ArrayList<Cuota> cuotas = new ArrayList();

        for (int i = 0; i < poliza.getCuotas(); i++) {
            System.out.println("Poliza " + poliza.getNumPoliza());
            Cuota cuota = new Cuota();
            cuota.setNroCuota(i+1);
            System.out.println("Cuota nro. : " + cuota.getNroCuota());
            cuota.setMontoTotal(poliza.getMontoTotal() / poliza.getCuotas());
            System.out.println("Valor de la cuota: " + cuota.getMontoTotal());
            System.out.println("La cuota está paga? (S/N)");
            if (leer.next().equalsIgnoreCase("S")) {
                cuota.setCuotaPaga(true);
            } else {
                cuota.setCuotaPaga(false);
            }
            int diaVenc = poliza.getFechaInicio().getDate();
            int mesVenc = poliza.getFechaInicio().getMonth() + (i + 1);
            int anioVenc = poliza.getFechaInicio().getYear();
            Date fechaV = new Date(anioVenc, mesVenc, diaVenc);
            cuota.setFechaVencimiento(fechaV);
            System.out.println("Fecha de Vencimiento: " + cuota.getFechaVencimiento());
            cuota.setFormaPago(poliza.getFormaPago());
            cuotas.add(cuota);
        }
        poliza.setCuotasLista(cuotas);
    }
}
