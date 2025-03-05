package org.example;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private List<CuentaBancaria> cuentas;
    private Scanner scanner;

    public  void main(String[] args) {
        cuentas = new LinkedList<>();
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("++++++++++++++++++++Cuenta Bancaria+++++++++++++++++++++++");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearCuenta();
                    break;
                case 2:
                    CuentaBancaria.depositar();
                    break;
                case 3:
                    CuentaBancaria.retirar();
                    break;
                case 4:
                    System.out.println("Adiós...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }
    }


    public void crearCuenta() {
        System.out.print("Ingrese el nombre del titular: ");
        String titular = scanner.next();
        System.out.print("Ingrese el número de cuenta: ");
        String numCuenta = scanner.next();
        System.out.print("Ingrese el saldo inicial: ");
        double saldo = scanner.nextDouble();
        cuentas.add(new CuentaBancaria(titular, numCuenta, saldo));
        System.out.println("Cuenta creada con éxito.");
    }




}
