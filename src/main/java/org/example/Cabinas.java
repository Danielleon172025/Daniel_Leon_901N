package org.example;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Cabinas {

    private String CodCabina;
    private int totalLlamadas;
    private int totalMinutos;
    private int totalCosto;
    private static final int Local = 50;
    private static final int LargaDistancia = 350;
    private static final int Celular = 150;
    private static List<Cabinas> inventario = new LinkedList<>();
    private static List<Cabinas> llamadas = new LinkedList<>();
    private static String tipo;
    private static int costo;
    private static int duracion;



    public Cabinas() {
    }

    public Cabinas(String codCabina, String tipo, int duracion, int costo) {
        this.CodCabina = codCabina;
        this.tipo = tipo;
        this.duracion = duracion;
        this.costo = costo;
    }

    public Cabinas(String codCabina) {
        this.CodCabina = codCabina;
    }

    public String getCodCabina() {
        return CodCabina;
    }

    public static void crearCabina() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el código de la cabina:");
        String codCabina = scanner.next();
        Cabinas nuevaCabina = new Cabinas(codCabina);
        inventario.add(nuevaCabina);
        System.out.println("Cabina agregada exitosamente.");
    }

    public static void registrarLlamada() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese el código de la cabina:");
        String CodCabina = scanner.next();

        boolean cabinaEncontrada = false;

        for (Cabinas cabina : inventario) {
            if (cabina.getCodCabina().equals(CodCabina)) {
                cabinaEncontrada = true;
                System.out.println("Seleccione el tipo de llamada: 1. Local, 2. Larga Distancia, 3. Celular");
                int opcion = scanner.nextInt();

                duracion = random.nextInt(10) + 1; // Genera duración entre 1 y 10 minutos
                costo = 0;
                tipo = "";

                switch (opcion) {
                    case 1:
                        tipo = "local";
                        costo = Local * duracion;
                        break;
                    case 2:
                        tipo = "larga_distancia";
                        costo = LargaDistancia * duracion;
                        break;
                    case 3:
                        tipo = "celular";
                        costo = Celular * duracion;
                        break;
                    default:
                        System.out.println("Opción inválida, intente de nuevo.");
                        return;
                }


                cabina.totalLlamadas++;
                cabina.totalMinutos += duracion;
                cabina.totalCosto += costo;

                Cabinas llamada = new Cabinas(CodCabina,tipo,duracion,costo);
                llamadas.add(llamada);

                System.out.println("Se realizó una llamada: " + tipo + " de " + duracion + " minutos en la cabina " + CodCabina);
                System.out.println("Costo de la llamada: " + costo + " pesos.");
                return;
            }
        }


        if (!cabinaEncontrada) {
            System.out.println("Cabina no encontrada.");
        }
    }

    public static void mostrarInformacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el código de la cabina para ver los detalles:");
        String codigoIngresado = scanner.next();

        for (Cabinas p : llamadas) {
            if (p.getCodCabina().equals(codigoIngresado)) {
                System.out.println("Código: " + p.CodCabina);
                System.out.println("Tipo Llamada: " + p.tipo);
                System.out.println("Duracion: " + p.duracion);
                System.out.println("Cantidad en stock: " + p.costo);
                return;
            }

        }
        System.out.println("No hay llamadas registradas para "+codigoIngresado);
    }

        public static void mostrarConsolidado () {
            int totalLlamadas = 0;
            int totalMinutos = 0;
            int totalCosto = 0;

            for (Cabinas cabina : inventario) {
                totalLlamadas += cabina.totalLlamadas;
                totalMinutos += cabina.totalMinutos;
                totalCosto += cabina.totalCosto;
            }

            System.out.println("Consolidado total:");
            System.out.println("Total llamadas: " + totalLlamadas);
            System.out.println("Total minutos: " + totalMinutos);
            System.out.println("Costo total: " + totalCosto + " pesos");
        }
    }

