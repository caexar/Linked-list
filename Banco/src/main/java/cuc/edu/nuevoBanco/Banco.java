/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuc.edu.nuevoBanco;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author andre
 */
public class Banco {
    private String nombreBanco;
    private ArrayList <CuentaAhorro> ListaCuentas= new  ArrayList();

    
    public Banco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.nombreBanco);
        hash = 59 * hash + Objects.hashCode(this.ListaCuentas);
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
        if (!Objects.equals(this.ListaCuentas, other.ListaCuentas)) {
            return false;
        }
        return true;
    }

   
    
    
    @Override
    public String toString() {
        return "Banco{" + "nombreBanco=" + nombreBanco + ", ListaCuentas=" + ListaCuentas + '}';
    }

    
    

    

    
    
    //metodo adicionar
    
    
    
    public boolean adicionarCuenta(String nombre,int id, int telefono, int numeroCuenta, int saldo){
        
        CuentaAhorro CuentaNueva= new CuentaAhorro(nombre,id,telefono,numeroCuenta,saldo);
         
       return ListaCuentas.add(CuentaNueva);
        
        
    }
    
  //metodo buscar
    
     public boolean buscar(String nombre,int id, int telefono, int numeroCuenta, int saldo){
        
        CuentaAhorro CuentaNueva= new CuentaAhorro(nombre,id,telefono,numeroCuenta,saldo);
         
       return ListaCuentas.contains(CuentaNueva);
        
        
    }
    
   //metodo eliminar
     
     public boolean eliminar(String nombre,int id, int telefono, int numeroCuenta, int saldo){
        
        CuentaAhorro CuentaNueva= new CuentaAhorro(nombre,id,telefono,numeroCuenta,saldo);
         
       return ListaCuentas.remove(CuentaNueva);
     
    }
     
     
   //metodo buscar las cuentas del saldo indicado
     
     
     public ArrayList<CuentaAhorro> indicarCuentasPorSaldo(int saldoBuscar){
        ArrayList <CuentaAhorro> resultadoPorSaldo= new  ArrayList();
        
         for (int i = 0; i < ListaCuentas.size(); i++) {
             if (ListaCuentas.get(i).getSaldoCuenta()== saldoBuscar) {
                 resultadoPorSaldo.add(ListaCuentas.get(i));
               
             }
            
         }
              return resultadoPorSaldo; 
}


  //metodos buscar por nombre
     
     
    public ArrayList<CuentaAhorro> buscarCuentasNombres(String Nombre){
        ArrayList<CuentaAhorro> cuentasNombres = new ArrayList();
        
        for (int i = 0; i < cuentasNombres.size(); i++) {
            if (ListaCuentas.get(i).getNombre()== Nombre) {
                cuentasNombres.add(ListaCuentas.get(i));
            }
            
        }
        return cuentasNombres;
    } 
     
     
     
     

     
     
}
