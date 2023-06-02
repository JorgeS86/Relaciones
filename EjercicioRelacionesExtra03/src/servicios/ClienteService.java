/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Cliente;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class ClienteService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cliente crearCliente() {
        Cliente clienteAux = new Cliente();
        System.out.println("Nombre del Cliente");
        clienteAux.setNombre(leer.next());
        
        System.out.println("Apellido del Cliente");
        clienteAux.setApellido(leer.next());
        
      /*  System.out.println("DNI del Cliente");
        clienteAux.setDocumento(leer.next());
        
        System.out.println("Mail del Cliente");
        clienteAux.setMail(leer.next());
        
        System.out.println("Domicilio del Cliente");
        clienteAux.setDomicilio(leer.next());
        
        System.out.println("Telefono del Cliente");
        clienteAux.setTelefono(leer.next());*/
        return clienteAux;
    }
}
