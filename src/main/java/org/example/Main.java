package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ruletarusa juego = new Ruletarusa();
        int a=0;

        System.out.println("++++++++++++Bienvenido a la Ruleta Rusa+++++++++++++");
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Disparar");
            System.out.println("2. Salir");
            System.out.print("+++++++++++++++++++++++++++++++++++++++++++++++++++");

            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("ngrese una opcion valida..");
                continue;
            }

            a = scanner.nextInt();

            switch (a) {
                case 1:
                    if (juego.disparar()) {
                        System.out.println("¡BANG! Juego Finalizado.");
                        return;
                    } else {
                        System.out.println("¡Un disparo menos! Sigues con vida.");
                    }
                    break;
                case 2:
                    System.out.println("Adios.");
                    return;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        }
    }
}
