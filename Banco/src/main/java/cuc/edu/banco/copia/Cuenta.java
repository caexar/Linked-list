/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuc.edu.banco.copia;

import java.util.Objects;

/**
 *
 * @author andre
 */
public class Cuenta {
    
     //atributos
    private String nombre;
    private int id;
    private String telefono;
    private int numeroCuenta;
    private double saldo;

    
    //Constructores
   

    public Cuenta(String nombre, int id, String telefono, int numeroCuenta, double saldoInicial) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.numeroCuenta = numeroCuenta;
        saldo = saldoInicial;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //toString
    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", id=" + id + ", telefono=" + telefono + ", numeroCuenta=" + numeroCuenta + "}";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuenta other = (Cuenta) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.numeroCuenta != other.numeroCuenta) {
            return false;
        }
        if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        return true;
    }

    
    
   

    
    

    //Metodos propios de la clase
    public String consultarSaldo() {
        return "Su saldo es de: $" + saldo;
    }

    public void consignar(double valorConsignado) {
        if (valorConsignado > 0) {
            this.saldo += valorConsignado;
        }
    }

    public void retirar(double valorRetirado) {
        if (valorRetirado > 0 && valorRetirado <= this.saldo) {
            this.saldo -= valorRetirado;
        }
    }

    public void transferir(double transferencia, Cuenta cuenta02) {
        if (transferencia > 0 && transferencia <= this.saldo) {
            cuenta02.consignar(transferencia);
            this.retirar(transferencia);
        }
    }
    
    
    
    
    
}
