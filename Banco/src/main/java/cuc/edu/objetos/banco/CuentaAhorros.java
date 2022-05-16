
package cuc.edu.objetos.banco;
public class CuentaAhorros {
    
   //atributos
    private  String nombre;
    private  int id;
    private  int telefono;
    private int numeroCuenta;
    private  double saldoCuenta;
    
    
    //constructores

    public CuentaAhorros(String nombre, int id, int telefono, int numeroCuenta, double saldoCuenta) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
    }
    
    //metodos
    //metodo consignar
    
    public double consignar(double dineroConsignado){
        
      saldoCuenta +=  dineroConsignado;
      
      return saldoCuenta;
    }
    
    //metodo consultar
    
     public double consultar(){
     
     return saldoCuenta;
    }
     
    //metodo retirar
    
        public double retirar(double dineroAretirar){
        
      saldoCuenta -=  dineroAretirar;
      
      return saldoCuenta;
    }
    // metodo transferir
      
        public String transferir(double dineroAtransferir, CuentaAhorros cuentaAhorros01, CuentaAhorros cuentaAhorros02){
         
            
            saldoCuenta -=  dineroAtransferir;
            cuentaAhorros02.saldoCuenta = + dineroAtransferir;
            
            return " transferencia exitosa "; 
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
