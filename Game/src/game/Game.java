/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game;

import java.util.Scanner;

/**
 *
 * @author jv
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcio;
        Personatge[] arrayPersonajes = new Personatge[3];
        int contador = 0;

        do {
            System.out.println("1.Crear personatge");
            System.out.println("2.Mostrar personatges");
            System.out.println("3.Simular batalla");
            System.out.println("4.Sortir");
            opcio = scanner.nextInt();
            scanner.nextLine();

            switch (opcio) {
                case 1:
                    if (contador >= 3) {
                        System.out.println("Has llegado al max");
                    } else {
                        System.out.println("Tipus de personatge:");
                        String tipus = scanner.nextLine();
                        System.out.println("Nom del personatge");
                        String nom = scanner.nextLine();
                        System.out.println("Nom de la habilitat");
                        String nomhab = scanner.nextLine();
                        System.out.println("Nivell del personatge");
                        int nivell = scanner.nextInt();
                        System.out.println("Vida del personatge");
                        int vida = scanner.nextInt();
                        System.out.println("DP de la habilitat");
                        int dany = scanner.nextInt();
                        Habilitat hab = new Habilitat(nomhab, dany);
                        if (tipus == "Mag") {
                            arrayPersonajes[contador] = new Mag(nom, nivell, vida, hab);

                        } else if (tipus == "Arquer") {
                            arrayPersonajes[contador] = new Arquero(nom, nivell, vida, hab);

                        } else {
                            arrayPersonajes[contador] = new Guerrer(nom, nivell, vida, hab);

                        }
                        contador++;
                    }
                    break;

                case 2:
                    for (int i = 0; i < 3; i++) {
                        arrayPersonajes[i].mostrarInfo();
                    }

                    break;

                case 3:
                    int eleccionUsuario;
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i);
                        arrayPersonajes[i].mostrarInfo();
                    }

                    //Personaje 1
                    do {
                        System.out.println("Selecciona el personaje");
                        eleccionUsuario = scanner.nextInt();
                        scanner.nextLine();
                    } while (eleccionUsuario <= 1 && eleccionUsuario >= 3);
                    
                    
                    //Personaje 2
                    int eleccionUsuario2;
                    do {
                        System.out.println("Selecciona el segundo personaje");
                        eleccionUsuario2 = scanner.nextInt();
                        scanner.nextLine();
                    } while (eleccionUsuario2 <= 1 && eleccionUsuario2 >= 3 && eleccionUsuario2 != eleccionUsuario);
                    
                    
                    //Cada alumno lo ha hecho diferente
                    
                    
                    break;

            }

        } while (opcio != 4);
    }

}
