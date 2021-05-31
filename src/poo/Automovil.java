/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author user
 */
public class Automovil {
    int placa;
    double precio;
    double impuesto;

    public Automovil(int placa, double precio, double impuesto) {
        this.placa = placa;
        this.precio = precio;
        this.impuesto = impuesto;
    }

    public Automovil() {
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    
    
   
}
