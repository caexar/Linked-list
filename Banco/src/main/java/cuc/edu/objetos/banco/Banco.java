
package cuc.edu.objetos.banco;

import java.util.ArrayList;

public class Banco {
    
    
    
    private ArrayList <CuentaAhorros> ListaCuentas = new ArrayList(); 

    
    public ArrayList<CuentaAhorros> getListaCuentas() {
        return ListaCuentas;
    }

    @Override
    public String toString() {
        return "Banco{" + "ListaCuentas=" + verBanco()  ;
    }
    
    
    
    //metodo adicionar
    public boolean añadirCuenta(String nombre, int id, int telefono, int numeroDeCuenta, int SaldoCuenta){
        
        CuentaAhorros cuentaNueva= new CuentaAhorros(nombre,id,telefono,numeroDeCuenta,SaldoCuenta);
        
        
       return ListaCuentas.add(cuentaNueva);
        
      
    }
    
    
    //metodo buscar
    public boolean buscarCuenta(String nombre, int id, int telefono, int numeroDeCuenta, int SaldoCuenta){
        
      CuentaAhorros cuentaNueva= new CuentaAhorros(nombre,id,telefono,numeroDeCuenta,SaldoCuenta);
        
      for (int i = 0; i < ListaCuentas.size(); i++) {
              
                if (ListaCuentas.get(i).equals(cuentaNueva)) {
                    
                 
                 return true;
                } 
              
        }   
       return false;
    }
   
    
    //metodo eliminar
    public void eliminarCuenta(String nombre, int id, int telefono, int numeroDeCuenta, int SaldoCuenta){
        
        CuentaAhorros cuentaeliminar= new CuentaAhorros(nombre,id,telefono,numeroDeCuenta,SaldoCuenta);
        ListaCuentas.remove(cuentaeliminar);
    }
    
    
    //metodo indicar las cuentas que tengan un saldo indicado por el usuario
    
    public ArrayList<CuentaAhorros> indicarCuentasSaldo(double saldoCuenta){
        
     ArrayList <CuentaAhorros> resultado = new ArrayList<>();
    
 
            for (int i = 0; i < ListaCuentas.size(); i++) {
              
                if (ListaCuentas.get(i).getSaldoCuenta() == saldoCuenta) {
                    
                  resultado.add(ListaCuentas.get(i));
                }
                
                
                
            }
            return resultado;
}
    
    //metodo indicar las pertenecientes a un cliente indicado por el usuario
    
    public ArrayList indicarCuentasUsuario(String nombreUsuario, int id){
        
     ArrayList <CuentaAhorros> resultadousuario = new ArrayList<>();
    
 
            for (int i = 0; i < ListaCuentas.size(); i++) {
              
                if (ListaCuentas.get(i).getNombre().equals(nombreUsuario) && ListaCuentas.get(i).getId() == id ) {
                    
                  resultadousuario.add(ListaCuentas.get(i));
                }
                
                
                
            }
            return resultadousuario;
}
    
    
    
    
    
    
    
    public String verBanco(){
        String resultado="";
        for (int i = 0; i < ListaCuentas.size(); i++) {
           
             resultado += ListaCuentas.get(i) ;
            
        }
           
            resultado += "\n";
        
        return resultado;
    }
    
    
    
    
    
    
    
    
       
} 
    

