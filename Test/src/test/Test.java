/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author jv
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Alumno al1 = new Alumno("Pedro", 18, 4.0);
        al1.caminar();
        al1.estudiar();
        System.out.println("La nota del alumno " + al1.getNom() + " es: " + al1.getNota());
        
        Profesor pr1 = new Profesor("Alex", 30);
        pr1.setAula(112);
        pr1.caminar();
        pr1.corregir();
        
        
        // VEHICULOS
        
        Coche coche1 =  new Coche("Seat","1111MMM",100,"Rojo",3);
        Moto moto1 = new Moto("Yamaha","2222MMM", 150, "RR");
        Camion camion1 = new Camion("Ibeco","3333MMM", 500, 2500);
        
        coche1.acelerar();
        coche1.aparcar();
        moto1.acelerar();
        System.out.println(moto1.getVelocidad());
        camion1.setCarga(5000);
        coche1.pintar("Verde");
        coche1.frenar();
         
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        String nombre = scanner.nextLine();
        //System.out.println("El nombre es: " + nombre);

        /*Flauta[] flautas = new Flauta[3];
        flautas[0] = new Flauta("Flautin","Plastico");
        flautas[1] = new Flauta("Flautita","Hierro");
        flautas[2] = new Flauta("Flauton","Madera");
        
        for (int i = 0; i < 3; i++) {
            flautas[i].tocar();
        }
         
        Instrumento[] instrumentos = new Instrumento[3];
        instrumentos[0] = new Flauta("Flautin", "Plastico");
        instrumentos[1] = new Tambor("Tamborcito");
        instrumentos[2] = new Tambor("Tamboooor");

        for (int i = 0; i < 3; i++) {
            instrumentos[i].tocar();
        }

        // Flauta f1 = new Flauta(nombre, "Madera");
        // f1.tocar();
        //Tambor t1 = new Tambor("Tamborcito");
        //t1.tocar();
        
        
/*
Le pedimos al usuario numero de instrumentos
Crear instrumentos:
	- Pedir los datos al usuario.
	- Que tipo de instrumento es.
	- Crear el instrumento
Poder tocar el instrumento que queramos.
Mostrar información del instrumento.
         
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos instrumentos quieres? ");
        int iNum = scanner.nextInt();
        scanner.nextLine();
        Instrumento[] instrumentos = new Instrumento[iNum];

        for (int i = 0; i < iNum; i++) {
            System.out.println("Que instrumento quieres crear: ");
            System.out.println("1. Flauta ");
            System.out.println("2. Tambor ");
            System.out.println("Escoge una opcion");
            int iTipo = scanner.nextInt();
            scanner.nextLine();

            if (iTipo == 1) {
                System.out.println("Introduce el nombre de la flauta:");
                String nombre = scanner.nextLine();
                System.out.println("Introduce el material de la flauta:");
                String material = scanner.nextLine();
                instrumentos[i] = new Flauta(nombre, material);
            } else {
                System.out.println("Introduce el nombre de la tambor:");
                String nombre = scanner.nextLine();
                instrumentos[i] = new Tambor(nombre);
            }

        }
        
        System.out.println("Quieres tocar los instrumentos");
        System.out.println("1. Si");
        System.out.println("2. No");
        int tocar = scanner.nextInt();

        if(tocar == 1){
            for(int i=0;i<iNum;i++){
                instrumentos[i].tocar();
            }
        }
    }*/
        
        
        
        Flauta f1 = new Flauta("Flautin","Madera");
        Flauta f2 = new Flauta("Flautita","Plastico");
        Tambor t1 = new Tambor("Tamborcito");
        
        
        System.out.println(Instrumento.getContador());
    }
        

}
