/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prodlist;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author jv
 */
public class ProdList {

    static ArrayList<Producto> productos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opt;
        do {
            System.out.println("\n--- Menu ---\n1.Agregar producto\n2.Mostrar productos\n3.Buscar por ID\n4.Actualizar precio por ID\n5.Eliminar producto\n6.Mostrar producto más caro\n7.Salir\n\n Elija una opción:");
            opt = scanner.nextInt();
            scanner.nextLine();

            switch (opt) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    MostrarProducto();
                    break;
                case 3:
                    buscarProductoPorId();
                    break;
                case 4:
                    actualizarPrecio();
                    break;
                case 5:
                    eliminarProducto();
                    break;
                case 6:
                    mostrarproductoMasCaro();
                    break;
            }

        } while (opt != 7);
    }

    private static void agregarProducto() {
        System.out.println("Introdueix ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introdueix el nom: ");
        String nombre = scanner.nextLine();
        System.out.println("Introdueix el preu: ");
        double precio = scanner.nextDouble();

        productos.add(new Producto(id, nombre, precio));
        System.out.println("Producte afegit amb exit!");
    }

    private static void MostrarProducto() {
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).aString());

        }
    }

    private static void buscarProductoPorId() {
        System.out.println("Que producto quieres buscar:");
        int id = scanner.nextInt();

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == id) {
                System.out.println(productos.get(i).aString());
            } else {
                System.out.println("Producto no encontrado");
            }
        }
    }

    private static void actualizarPrecio() {
        System.out.println("ID del producto: ");
        int id = scanner.nextInt();
        System.out.println("Nuevo precio: ");
        double NPrecio = scanner.nextDouble();
        for (Producto p : productos) {
            if (p.id == id) {
                p.precio = NPrecio;
                System.out.println("Precio actualizado!");
            }
        }
    }

    private static void eliminarProducto() {
        System.out.print("ID del producto a eliminar: ");
        int id = scanner.nextInt();
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                System.out.println("Producte eliminat.");
            }
        }
        System.out.println("Producte no trobat.");
    }

    private static void mostrarproductoMasCaro() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos.");
        } else {
            Producto masCaro = productos.get(0);
            for (Producto productos : productos) {
                if (productos.getPrecio() > masCaro.getPrecio()) {
                    masCaro = productos;
                }
            }
            System.out.println("El producto más caro encontrado és: " + masCaro.aString());
        }
    }

}
