/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jorge
 */
public class Poliza {
    private Integer numPoliza;
    private Date fechaInicio;
    private Date fechaFinal;
    private Integer cuotas;
    private String formaPago;
    private Integer montoTotal;
    private Boolean incluyeGranizo;
    private Integer montoGranizo;
    private String tipoCobertura;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private ArrayList<Cuota> cuotasLista;

    public Poliza() {
    }

    public Poliza(Integer numPoliza, Date fechaInicio, Date fechaFinal, Integer cuotas, String formaPago, Integer montoTotal, Boolean incluyeGranizo, Integer montoGranizo, String tipoCobertura, Cliente cliente, Vehiculo vehiculo, ArrayList<Cuota> cuotasLista) {
        this.numPoliza = numPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.cuotas = cuotas;
        this.formaPago = formaPago;
        this.montoTotal = montoTotal;
        this.incluyeGranizo = incluyeGranizo;
        this.montoGranizo = montoGranizo;
        this.tipoCobertura = tipoCobertura;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.cuotasLista = cuotasLista;
    }

    public Integer getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(Integer numPoliza) {
        this.numPoliza = numPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Integer getCuotas() {
        return cuotas;
    }

    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Integer getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Integer montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Boolean getIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(Boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public Integer getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(Integer montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ArrayList<Cuota> getCuotasLista() {
        return cuotasLista;
    }

    public void setCuotasLista(ArrayList<Cuota> cuotasLista) {
        this.cuotasLista = cuotasLista;
    }

    @Override
    public String toString() {
        return "Poliza{" + "numPoliza=" + numPoliza + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", cuotas=" + cuotas + ", formaPago=" + formaPago + ", montoTotal=" + montoTotal + ", incluyeGranizo=" + incluyeGranizo + ", montoGranizo=" + montoGranizo + ", tipoCobertura=" + tipoCobertura + ", cliente=" + cliente + ", vehiculo=" + vehiculo + ", cuotasLista=" + cuotasLista + '}';
    }
    
}
