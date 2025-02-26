/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prodlist;

/**
 *
 * @author jv
 */
public class Producto {
    int id;
    String nombre;
    double precio;
    
    public Producto(int id, String nombre, double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String aString(){
        return "ID: "+this.id+", Nombre: "+this.nombre+", Precio: "+this.precio;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
            
    
}
