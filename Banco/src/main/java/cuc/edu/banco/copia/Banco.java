/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuc.edu.banco.copia;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author andre
 */
public class Banco {
      //Atributos
    private String nombreBanco;
    private ArrayList<Cuenta> listaCuentas = new ArrayList<>();

    //Constructor
    public Banco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
    
    //getters y setters
    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
    
    public String verListaCuentas() {
        return listaCuentas.toString();
    }
    
    //toString
    @Override
    public String toString() {
        return "Banco{" + "nombreBanco=" + nombreBanco + ", listaCuentas=" + listaCuentas + '}';
    }
    
    //Equals

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Banco other = (Banco) obj;
        if (!Objects.equals(this.nombreBanco, other.nombreBanco)) {
            return false;
        }
        if (!Objects.equals(this.listaCuentas, other.listaCuentas)) {
            return false;
        }
        return true;
    }
   
    
    
    
    public void adicionar(String nombreBanco, int id, String telefono, int numeroCuenta, double saldoInicial) {
        Cuenta cuenta = new Cuenta(nombreBanco, id, telefono, numeroCuenta, saldoInicial);
        listaCuentas.add(cuenta);
    }
    
    public boolean buscar(int numeroCuenta) {
        for (int i = 0; i < listaCuentas.size(); i++) {
            Cuenta actual = listaCuentas.get(i);
            if(actual.getNumeroCuenta() == numeroCuenta) {
                return true;
            }
        }
        return false;
    }
    public boolean eliminar(int numeroCuenta) {
        for (int i = 0; i < listaCuentas.size(); i++) {
            Cuenta actual = listaCuentas.get(i);
            if(actual.getNumeroCuenta() == numeroCuenta) {
                listaCuentas.remove(actual);
                return true;
            }
        }
        return false;
    }
    
    

    public ArrayList<Cuenta> buscarPorSaldos(Double saldo) {
        
        ArrayList<Cuenta> nuevaLista = new ArrayList<>();
        
        for (int i = 0; i < listaCuentas.size(); i++) {
            Cuenta actual = listaCuentas.get(i);
            if(actual.getSaldo() == saldo) {
                nuevaLista.add(actual);
            }
        }
        return nuevaLista;
    }
 
    public ArrayList<Cuenta> buscarPorNombre(String nombre) {
        ArrayList<Cuenta> nuevaLista = new ArrayList<>();
        for (int i = 0; i < listaCuentas.size(); i++) {
            Cuenta actual = listaCuentas.get(i);
            if(actual.getNombre().equals(nombre)) {
                nuevaLista.add(actual);
            }
        }
        return nuevaLista;
    }
}
