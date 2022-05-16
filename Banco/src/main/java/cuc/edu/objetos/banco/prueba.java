/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuc.edu.objetos.banco;

/**
 *
 * @author andre
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
       CuentaAhorros cuenta01 = new CuentaAhorros("leonardo Perez",32105,30926,1123,50000);
       CuentaAhorros cuenta02 = new CuentaAhorros("cuenta a transferir",32105,30926,1123,0);
        System.out.println("consulta "+ cuenta01.consultar());
       // System.out.println("consignacion "+ cuenta01.consignar(2000));
       // System.out.println("consulta "+ cuenta01.consultar());
        
       // System.out.println("retirar"+ cuenta01.retirar(2000));
        
      // System.out.println("consulta "+ cuenta01.consultar()); 
        
        System.out.println("transferir----" + cuenta01.transferir
        (50000, cuenta01, cuenta02)+ " nuevo saldo de la cuenta 1 es "+ cuenta01.consultar() + " nuevo saldo de la cuenta 2 es : "+ cuenta02.consultar());
        
        
        
        
        
        
        
        
    }
    
}
