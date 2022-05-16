
package cuc.edu.nuevoBanco;


public class PruebaBanco {

    public static void main(String[] args) {
      
        
     Banco banco01 = new Banco("bancolombia");
     
        System.out.println("cuenta adicionar"+ banco01.adicionarCuenta("leonardo ", 1, 2, 3, 4));   
        System.out.println("cuenta adicionar"+ banco01.adicionarCuenta("leonard ", 6, 2, 3, 4));
        //metodo buscar
      //  System.out.println("buscar 1 "+ banco01.buscar("leonardo ", 1, 2, 3, 4));
      //  System.out.println("buscar 2 "+ banco01.buscar("leonard ", 6, 2, 3, 4));
        
     
        //metodo eliminar
       // System.out.println("eliminar 1 " + banco01.eliminar("leonardo ", 6, 2, 3, 4));
        
        
        //metodo saldo buscar
        System.out.println("cuentas por saldo "+banco01.indicarCuentasPorSaldo(4));
        System.out.println(banco01);
        //metodo por nombre
        System.out.println("cuentas por nombre"+ banco01.buscarCuentasNombres("leonard"));
        
    }
    
 
}
