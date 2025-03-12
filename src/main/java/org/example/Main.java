package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cabinas Menu=new Cabinas();
        int opcion;

        System.out.println("++++++++++++ Bienvenido a la Cabina Telefónica +++++++++++++");

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear Cabina");
            System.out.println("2. Registrar Llamada");
            System.out.println("3. Información por Cabina");
            System.out.println("4. Consolidado");
            System.out.println("5. Salir");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Ingrese una opción válida..");
                continue;
            }

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Menu.crearCabina();
                    break;
                case 2:
                    Menu.registrarLlamada();
                    break;

                    case 3:
                    Menu.mostrarInformacion ();
                    break;
                case 4:
                    Menu.mostrarConsolidado();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }
}
