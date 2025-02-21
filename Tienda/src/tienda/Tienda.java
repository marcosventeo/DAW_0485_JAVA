/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author jv
 *
 * usuari (abstract) -> client, proveidor producte (abstract) -> electronics,
 * alimentacio operacions (interifice) -> tots
 *
 *
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Integer> numeros = new ArrayList();
        ArrayList<String> nombres = new ArrayList();

        nombres.add("Ana");
        nombres.add("Juan");
        nombres.add("Pep");
        nombres.add("Luis");
        nombres.add("Vanesa");
        nombres.add("Pep");

        //Empiezan en la posicion 0
        System.out.println(nombres.get(1)); //Juan
        nombres.set(1, "Joan"); // Sustituye Juan por Joan
        System.out.println(nombres.get(1)); //Joan

        nombres.remove(1); // Elimina Joan

        System.out.println("Tamaño: " + nombres.size());

        //Bucle for tradicional
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Nombre " + i + ": " + nombres.get(i));
        }

        Collections.sort(nombres); //Ordenar alfabeticamente
        Collections.reverse(nombres); //Girar array

        int indice = nombres.indexOf("Pep");
        int lastIndice = nombres.lastIndexOf("Pep");
        System.out.println("Pep esta en la posición: " + indice);
        System.out.println("Pep esta en la posición ULTIMA: " + lastIndice);

        //Bucle for-each
        for (String nombre : nombres) {
            System.out.println("Nom: " + nombre);
        }

        if (nombres.contains("Juan")) {
            System.out.println("Juan existe");
        } else {
            System.out.println("Juan NO existe");
        }
        nombres.clear();
        if (nombres.isEmpty()) {
            System.out.println("No existen nombres");
        }

        
       /*
        ArrayList<Producte> productos = new ArrayList();
        ArrayList<Usuari> usuarios = new ArrayList();
        
        
        
        Client cl1 = new Client("Anna Lopez");
        Proveidor pr1 = new Proveidor("Sergi Perez");
        usuarios.add(cl1);
        usuarios.add(pr1);
        
        Electronics el1 = new Electronics("HP 1000", 1000);
        Alimentacio al1 = new Alimentacio("Patata",5);
        productos.add(el1);
        productos.add(al1);
        productos.add(new Alimentacio("Chips",3));
        
        
        
        System.out.println("Clients registrats:");
        cl1.mostrarDades();
        
        System.out.println("Proveidors registrats:");
        pr1.mostrarDades();
        
        System.out.println("Productes disponibles:");
        el1.mostrarProducte();
        al1.mostrarProducte();
        
        cl1.registrar();
        pr1.eliminar();
        
        el1.registrar();
        al1.eliminar();
         */
    }

}
