/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author jorge
 */
public class Cuota {
    private Integer nroCuota;
    private Integer montoTotal;
    private Boolean cuotaPaga;
    private Date fechaVencimiento;
    private String formaPago;

    public Cuota() {
    }

    public Cuota(Integer nroCuota, Integer montoTotal, Boolean cuotaPaga, Date fechaVencimiento, String formaPago) {
        this.nroCuota = nroCuota;
        this.montoTotal = montoTotal;
        this.cuotaPaga = cuotaPaga;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public Integer getNroCuota() {
        return nroCuota;
    }

    public void setNroCuota(Integer nroCuota) {
        this.nroCuota = nroCuota;
    }

    public Integer getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Integer montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Boolean getCuotaPaga() {
        return cuotaPaga;
    }

    public void setCuotaPaga(Boolean cuotaPaga) {
        this.cuotaPaga = cuotaPaga;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "nroCuota=" + nroCuota + ", montoTotal=" + montoTotal + ", cuotaPaga=" + cuotaPaga + ", fechaVencimiento=" + fechaVencimiento + ", formaPago=" + formaPago + '}';
    }

    
    
}
