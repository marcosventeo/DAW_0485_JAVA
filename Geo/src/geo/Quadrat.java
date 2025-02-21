/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geo;

/**
 *
 * @author jv
 */
public class Quadrat extends Figura {

    public Quadrat(double base, double altura) {
        super(base, altura);
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Soy un QUADRADO");
    }

    @Override
    public double calcularArea() {
        return super.getBase() * super.getAltura();
    }

}
