/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiantes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

/**
 *
 * @author jv
 */
public class Estudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner dato = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList();

        int opcion;
        do {
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Ordenar estudiantes (nota)");
            System.out.println("4. Ordenar por nombre");
            System.out.println("5. Eliminar estudiante");
            System.out.println("6. Salir");
            System.out.print("Escoge una opción: ");
            opcion = dato.nextInt();
            dato.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Nombre del estudiante:");
                    String nombre = dato.nextLine();
                    System.out.println("Nota del estudiante " + nombre + ": ");
                    double nota = dato.nextDouble();
                    estudiantes.add(new Estudiante(nombre, nota));
                    break;
                case 2:
                    System.out.println("Listado de estudiantes:");
                    for (Estudiante e : estudiantes) {
                        System.out.println(e.getNom() + " [" + e.getNota() + "]");
                    }
                    break;
                case 3:
                    System.out.println("Ordenar estudiantes por nota (mayor a menor):");
                    estudiantes.sort(Comparator.comparing(Estudiante::getNota).reversed());
                    for (Estudiante e : estudiantes) {
                        System.out.println(e.getNom() + " [" + e.getNota() + "]");
                    }
                    break;
                case 4:

                    System.out.println("Ordenar estudiantes por Nombre:");
                    estudiantes.sort(Comparator.comparing(Estudiante::getNom));
                    for (Estudiante e : estudiantes) {
                        System.out.println(e.getNom() + " [" + e.getNota() + "]");
                    }
                    break;
                case 5:
                    System.out.println("Eliminar estudiantes por Nombre:");
                    System.out.println("Nombre del estudiante a borrar:");
                    String nomB = dato.nextLine();
                    estudiantes.removeIf(e -> e.getNom().equalsIgnoreCase(nomB));
                    break;
            }
        } while (opcion != 6);
    }

}
