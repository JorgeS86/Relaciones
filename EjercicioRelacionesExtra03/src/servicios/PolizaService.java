/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Cliente;
import entidades.Poliza;
import entidades.Vehiculo;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class PolizaService {

    ClienteService CS = new ClienteService();
    VehiculoService VS = new VehiculoService();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Poliza crearPoliza() {
        Poliza polizaAux = new Poliza();
        
        //System.out.println("Numero de Póliza");
        //polizaAux.setNumPoliza(leer.nextInt());

        System.out.println("Fecha de Inicio");
        System.out.println("Día (dd)");
        int diaI = leer.nextInt();
        System.out.println("Mes (mm)");
        int mesI = leer.nextInt() - 1;
        System.out.println("Año (aaaa)");
        int anioI = leer.nextInt() + 100;
        Date fechaInicio = new Date(anioI, mesI, diaI);
        polizaAux.setFechaInicio(fechaInicio);

        System.out.println("Fecha de Finalización");
        System.out.println("Día (dd)");
        int diaF = leer.nextInt();
        System.out.println("Mes (mm)");
        int mesF = leer.nextInt() - 1;
        System.out.println("Año (aa)");
        int anioF = leer.nextInt() + 100;
        Date fechaFinal = new Date(anioF, mesF, diaF);
        polizaAux.setFechaFinal(fechaFinal);

        int cuotas = polizaAux.getFechaFinal().getMonth() - polizaAux.getFechaInicio().getMonth();
        polizaAux.setCuotas(cuotas);
        System.out.println("Cuotas: "+cuotas);

        System.out.println("Forma de Pago");
        polizaAux.setFormaPago(leer.next());

        System.out.println("Monto Total Asegurado");
        polizaAux.setMontoTotal(leer.nextInt());

        System.out.println("Incluye Granizo (S/N)?");
        if (leer.next().equalsIgnoreCase("S")) {
            polizaAux.setIncluyeGranizo(true);
        } else {
            polizaAux.setIncluyeGranizo(false);
        }
        if (polizaAux.getIncluyeGranizo()) {
            System.out.println("Monto Máximo por Granizo");
            polizaAux.setMontoGranizo(leer.nextInt());
        }else{
            polizaAux.setMontoGranizo(0);
        }

        System.out.println("Tipo de Cobertura");
        polizaAux.setTipoCobertura(leer.next());

        Cliente cliente = CS.crearCliente();
        polizaAux.setCliente(cliente);

        Vehiculo vehiculo = VS.crearVehiculo();
        polizaAux.setVehiculo(vehiculo);

        CuotaService CuotaSAux = new CuotaService();
        polizaAux.setCuotasLista(CuotaSAux.calcularCuotasPoliza(polizaAux));
        
        return polizaAux;
    }
}
