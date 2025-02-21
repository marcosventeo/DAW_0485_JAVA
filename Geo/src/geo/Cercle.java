/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geo;

/**
 *
 * @author jv
 */
public class Cercle extends Figura {

    private double PI = 3.1415;

    public Cercle(double base, double altura) {
        super(base, altura);
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Soy un CIRCULO");
    }

    @Override
    public double calcularArea() {
        return ((super.getBase() / 2) * (super.getBase() / 2)) * PI;
    }

}
