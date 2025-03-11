import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void vender(int cantidadVendida) {
        if (cantidadVendida > cantidad) {
            System.out.println("No hay suficiente stock de " + nombre);
        } else {
            cantidad -= cantidadVendida;
            System.out.println("Venta realizada: " + cantidadVendida + " unidades de " + nombre);
        }
    }

    public void reponer(int cantidadRepuesta) {
        cantidad += cantidadRepuesta;
        System.out.println("Stock actualizado. Nuevo stock de " + nombre + ": " + cantidad);
    }

    public void aplicarDescuento() {
        precio -= precio * 0.02;
        System.out.println("Descuento aplicado. Nuevo precio de " + nombre + ": " + precio);
    }

    public void aumentarPrecio() {
        precio += precio * 0.06;
        System.out.println("Precio aumentado. Nuevo precio de " + nombre + ": " + precio);
    }

    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad en stock: " + cantidad);
    }

    public double calcularValorTotal() {
        return precio * cantidad;
    }
}

public class Tienda {
    private List<Producto> inventario = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
        System.out.println("Producto agregado: " + producto.getCodigo());
    }

    public void eliminarProducto(String codigo) {
        Iterator<Producto> iterator = inventario.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getCodigo().equals(codigo)) {
                iterator.remove();
                System.out.println("Producto eliminado: " + codigo);
                return;
            }
        }
        System.out.println("Producto no encontrado: " + codigo);
    }

    public void mostrarInventarioTotal() {
        double total = 0;
        for (Producto producto : inventario) {
            total += producto.calcularValorTotal();
        }
        System.out.println("Valor total del inventario: " + total);
    }
