/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testswing;

/**
 *
 * @author jv
 */

import javax.swing.*;
import java.awt.event.*;


public class TestSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame ventana = new JFrame("Testing");
        ventana.setSize(300,150);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        
        String[] opciones = {"Manzana","Naranja","Plátano"};
        JComboBox frutas = new JComboBox(opciones);
        
        JButton boton = new JButton("Enviar");
        
        JCheckBox c1 = new JCheckBox("Opción a");
        JCheckBox c2 = new JCheckBox("Opción b");
        
        JRadioButton r1 = new JRadioButton("Rojo");
        JRadioButton r2 = new JRadioButton("Verde");
        JRadioButton r3 = new JRadioButton("SO");
        JRadioButton r4 = new JRadioButton("HA");
        ButtonGroup gColores = new ButtonGroup();
        ButtonGroup gSO = new ButtonGroup();
        gColores.add(r1);
        gColores.add(r2);
        gSO.add(r3);
        gSO.add(r4);
       
        
        ImageIcon ico = new ImageIcon("imagen.jpg");
        JLabel e = new JLabel(ico);
        
        
        
        
        
        //JSlider slider = new JSlider(0,100,50);
       // slider.setMajorTickSpacing(25);
        //slider.setPaintTicks(true);
       // slider.setPaintLabels(true);
       
       JProgressBar barra = new JProgressBar(0,100);
        barra.setStringPainted(true);
        
        JButton b = new JButton("Inciar despegue");
        
        Timer t = new Timer(500,null);
               
               
        
       
        t.addActionListener(new ActionListener(){
            
            int p=0;
            public void actionPerformed(ActionEvent e){
               
                
               barra.setValue(p);
               p+=1;
                
            }
        });
       
        
       
        
        
        
        
        
        
        boton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String seleccion = (String) frutas.getSelectedItem();
               // int valor = slider.getValue();
                JOptionPane.showMessageDialog(ventana, "Has elegido: " + seleccion + " - valor: ");
            }
        });
        
        
        
        panel.add(frutas);
        panel.add(boton);
        panel.add(c1);
        panel.add(c2);
        panel.add(r1);
        panel.add(r2);
        panel.add(r3);
        panel.add(r4);
        panel.add(b);
        panel.add(e);
        
      //  panel.add(slider);
        panel.add(barra);
        
        ventana.add(panel);
        ventana.setVisible(true);
        
        t.start();
        
        
                
        
        
        
        
    }
    
}
