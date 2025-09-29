/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioInventario;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ayala
 */

class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getValorTotal() {
        return precio * cantidad;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre +
               " | Precio: $" + precio +
               " | Cantidad: " + cantidad;
    }
}

public class SistemaInventario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> inventario = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\n--- MENÚ DE INVENTARIO ---");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar productos registrados");
            System.out.println("3. Calcular valor total del inventario");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del producto: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese precio: ");
                    double precio = sc.nextDouble();

                    System.out.print("Ingrese cantidad: ");
                    int cantidad = sc.nextInt();

                    inventario.add(new Producto(nombre, precio, cantidad));
                    System.out.println("Producto registrado con éxito.");
                    break;

                case 2:
                    if (inventario.isEmpty()) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        System.out.println("\n--- LISTA DE PRODUCTOS ---");
                        for (Producto p : inventario) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    double valorTotal = 0;
                    for (Producto p : inventario) {
                        valorTotal += p.getValorTotal();
                    }
                    System.out.println("Valor total del inventario: $" + valorTotal);
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }
}
