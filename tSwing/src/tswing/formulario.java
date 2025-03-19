/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tswing;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
/**
 *
 * @author jv
 */
public class formulario extends JFrame{
    public formulario(){
        setTitle("Ventana formulario");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel etiqueta = new JLabel("Formulario");
           
        JLabel nombre = new JLabel("Nombre");
        JTextField tNombre = new JTextField(15);
        
        JLabel fruta = new JLabel("Tu fruta favorita:");
        String[] frutas = {"Manzana","Plátano","Fresa"};
        JComboBox<String> cFrutas = new JComboBox(frutas);
        
        JLabel nivel = new JLabel("Tu nivel");
        JSlider sNivel = new JSlider(0,10,2);
        sNivel.setMajorTickSpacing(2);
        sNivel.setMinorTickSpacing(1);
        sNivel.setPaintTicks(true);
        sNivel.setPaintLabels(true);
        
        JButton bVolver = new JButton("Volver");
        
        bVolver.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new Inicio();
            }
        
        
        });
        sNivel.addChangeListener(new ChangeListener(){
            public void stateChanged(ChangeEvent e){
                etiqueta.setText("Valor: " + sNivel.getValue());
                
            }
        
        } );
        
        
        
        
        panel.add(etiqueta);
        panel.add(nombre);
        panel.add(tNombre);
        panel.add(fruta);
        panel.add(cFrutas);
        panel.add(nivel);
        panel.add(sNivel);
        panel.add(bVolver);
        add(panel);
        setVisible(true);
        
      
        
        
    }
    
}
