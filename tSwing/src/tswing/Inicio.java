/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tswing;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author jv
 */
public class Inicio extends JFrame{
    
    public Inicio(){
        setTitle("Programa principal");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        JLabel etiqueta = new JLabel("Bienvenido a mi programa");
        JButton bIr = new JButton("Ir al formulario");
        
        bIr.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //ACCION AL CLICK BOTON
                dispose();
                new formulario();
            }
        });
        
        panel.add(etiqueta);
        panel.add(bIr);
        add(panel);
        setVisible(true);
        
    }
    
}
