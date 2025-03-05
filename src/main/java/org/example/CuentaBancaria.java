package org.example;
import java.util.List;


public class CuentaBancaria {
    private String Titular;
    private String NumCuenta;
    private double Saldo;

    // Constructor
    public CuentaBancaria(String titular, String numCuenta, double saldo) {
        this.Titular = titular;
        this.NumCuenta = numCuenta;
        this.Saldo = saldo;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public String getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        NumCuenta = numCuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }


    private static CuentaBancaria buscarCuenta(List<CuentaBancaria> cuentas, String numCuenta) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNumCuenta().equals(numCuenta)) {
                return cuenta;
            }
        }
        return null;
    }


    public void depositar(List<CuentaBancaria> cuentas, String numCuenta, double cantidad) {
        CuentaBancaria cuenta = buscarCuenta(cuentas, numCuenta);
        if (cuenta != null) {
            if (cantidad > 0) {
                cuenta.setSaldo(cuenta.getSaldo() + cantidad);
                System.out.println("Depósito de $" + cantidad + " realizado con éxito.");
            } else {
                System.out.println("La cantidad a depositar debe ser mayor a 0.");
            }
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }


    public  void retirar(List<CuentaBancaria> cuentas, String numCuenta, double cantidad) {
        CuentaBancaria cuenta = buscarCuenta(cuentas, numCuenta);
        if (cuenta != null) {
            if (cantidad > 0 && cantidad <= cuenta.getSaldo()) {
                cuenta.setSaldo(cuenta.getSaldo() - cantidad);
                System.out.println("Retiro de $" + cantidad + " realizado con éxito.");
            } else {
                System.out.println("Fondos insuficientes o cantidad inválida.");
            }
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }
}







