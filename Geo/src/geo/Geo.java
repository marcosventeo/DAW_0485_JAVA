/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geo;

/**
 *
 * @author jv
 *
 * Figures
 *
 * Base / Altura mostraInfo calcularArea
 *
 *
 * Quadrat Cercle Triangle
 *
 * Array 3 figures
 *
 */
public class Geo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Figura[] figuras = new Figura[3];

        figuras[0] = new Quadrat(2, 2);
        figuras[1] = new Cercle(3, 3);
        figuras[2] = new Triangle(2, 3);

        for (int i = 0; i < 3; i++) {
            figuras[i].mostraInfo();
            System.out.println("El area es: " + figuras[i].calcularArea());
            
        }

    }

}
