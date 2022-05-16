
package cuc.edu.objetos.banco;

public class PruebaBanco {

    public static void main(String[] args) {
       
        
       Banco banco01 = new Banco() ;
       
       //metodo añadir cuenta
       
       banco01.añadirCuenta("Leonardo Perez", 100025, 123, 12345678, 50000);
     //  banco01.añadirCuenta("Leonardo Perez", 100025, 123, 12345678, 50); 
     //  banco01.añadirCuenta("Leonardo Perez", 100025, 123, 12345678, 500); 
     //  banco01.añadirCuenta("Leonardo Perez", 100025, 123, 12345678, 5000);  
        
       //System.out.println("Buscando "+ banco01.buscarCuenta("Leonardo Perez", 100025, 123, 12345678, 50000)); 
       
        System.out.println(""+ banco01.toString());
        
      //  System.out.println("cuentas saldo: "+ banco01.indicarCuentasSaldo(50000));  
        
    
        
        
        
        
        
    }
    
}
