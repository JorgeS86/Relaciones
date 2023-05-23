/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidades.Empresa;
import servicios.EmpresaServicio;

/**
 *
 * @author jorge
 */
public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        EmpresaServicio ES = new EmpresaServicio();
        
        ES.crearEmpresa(empresa);
        System.out.println(empresa);
    }
}
