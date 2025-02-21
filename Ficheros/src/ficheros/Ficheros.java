/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author jv
 */
public class Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ESCRIBIR EN UN FICHERO
        try{
            FileWriter escritura = new FileWriter("fichero.txt");
            escritura.write("Hola\n");
            escritura.write("Adios");
            escritura.close();
            System.out.println("Escrito con exito.");
            
        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        // LEER FICHERO
        try{
            File fitxer = new File("fichero.txt");
            Scanner leer = new Scanner(fitxer);
            
            while(leer.hasNextLine()){
                System.out.println(leer.nextLine());
            }
            leer.close();
            
        } catch(FileNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
}
