
package cuc.edu.nuevoBanco;

import java.util.Objects;

public class CuentaAhorro {
    //atributos
    private int numeroCuenta;
    private String titular;
    private int saldoCuenta;

    //constructor

    public CuentaAhorro(int numeroCuenta, String titular, int saldoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldoCuenta = saldoCuenta;
    }

    
   //getters y setters

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

     public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public int getSaldoCuenta() {
        return saldoCuenta;
    }

   
    
   // equals y hash

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.numeroCuenta;
        hash = 53 * hash + Objects.hashCode(this.titular);
        hash = 53 * hash + this.saldoCuenta;
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
        final CuentaAhorro other = (CuentaAhorro) obj;
        if (this.numeroCuenta != other.numeroCuenta) {
            return false;
        }
        if (this.saldoCuenta != other.saldoCuenta) {
            return false;
        }
        if (!Objects.equals(this.titular, other.titular)) {
            return false;
        }
        return true;
    }


    
    
    //string

    @Override
    public String toString() {
        return "CuentaAhorro{" + "numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldoCuenta=" + saldoCuenta + '}';
    }

  
    
    
}
