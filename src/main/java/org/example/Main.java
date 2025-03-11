

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = 0;
        System.out.println("++++++++++++Bienvenido a la Tienda+++++++++++++");
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear Producto");
            System.out.println("2. Vender Producto");
            System.out.println("3. Reponer Stock");
            System.out.println("4. Aplicar Descuento");
            System.out.println("5. Mostrar Detalles");
            System.out.println("6. Aumentar Precio Producto");
            System.out.println("7. Calcular Valor Total Inventario");
            System.out.println("8. Eliminar productos Inventario");
            System.out.print("+++++++++++++++++++++++++++++++++++++++++++++++++++");

            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Ingrese una opcion valida..");
                continue;
            }
            a = scanner.nextInt();

            switch (a) {
                case 1:
                    Tienda.agregarProducto();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;


            }
        }
    }
