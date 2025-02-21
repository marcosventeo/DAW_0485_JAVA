/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author jv
 */
public class Vehiculo {

    private String marca;
    private String matricula;
    private Integer potencia;
    private Integer velocidad = 0;

    public Vehiculo(String marca, String matricula, Integer potencia) {
        this.marca = marca;
        this.matricula = matricula;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void acelerar() {
        velocidad++;
        if (velocidad >= 120) {
            velocidad = 120;
        }
    }

    public void frenar() {
        velocidad--;
        if (velocidad <= 0) {
            velocidad = 0;
        }
    }

    public void aparcar() {
        if (velocidad == 0) {
            System.out.println("Aparcaooo");
        } else {
            System.out.println("Primero frena");
        }
    }
}
