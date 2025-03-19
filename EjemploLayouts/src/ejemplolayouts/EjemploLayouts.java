/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplolayouts;

/**
 *
 * @author jv
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EjemploLayouts extends JFrame{

    /**
     * @param args the command line arguments
     */
   


    JPanel panelBotones;  // Donde van los botones que se reorganizan

    public EjemploLayouts() {
        setTitle("Demo Layouts en Vivo");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal dividido en dos partes
        setLayout(new BorderLayout());

        // Panel superior con los botones de selección de layout
        JPanel panelControles = new JPanel();
        JButton btnFlow = new JButton("FlowLayout");
        JButton btnBorder = new JButton("BorderLayout");
        JButton btnGrid = new JButton("GridLayout");
        JButton btnBox = new JButton("BoxLayout (Y)");

        panelControles.add(btnFlow);
        panelControles.add(btnBorder);
        panelControles.add(btnGrid);
        panelControles.add(btnBox);

        add(panelControles, BorderLayout.NORTH);

        // Panel donde van los botones que se moverán según el layout
        panelBotones = new JPanel();
        add(panelBotones, BorderLayout.CENTER);

        // Añadimos algunos botones de prueba
        for (int i = 1; i <= 5; i++) {
            panelBotones.add(new JButton("Botón " + i));
        }

        // Acción de cada botón para cambiar de layout
        btnFlow.addActionListener(e -> aplicarFlowLayout());
        btnBorder.addActionListener(e -> aplicarBorderLayout());
        btnGrid.addActionListener(e -> aplicarGridLayout());
        btnBox.addActionListener(e -> aplicarBoxLayout());

        setVisible(true);
    }

    private void aplicarFlowLayout() {
        panelBotones.removeAll(); // Quita componentes anteriores si el layout anterior fue BorderLayout
        panelBotones.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        for (int i = 1; i <= 5; i++) {
            panelBotones.add(new JButton("Botón " + i));
        }
        refrescar();
    }

    private void aplicarBorderLayout() {
        panelBotones.removeAll(); // Muy importante en BorderLayout porque solo admite 5 zonas
        panelBotones.setLayout(new BorderLayout(10, 10));
        panelBotones.add(new JButton("NORTE"), BorderLayout.NORTH);
        panelBotones.add(new JButton("SUR"), BorderLayout.SOUTH);
        panelBotones.add(new JButton("ESTE"), BorderLayout.EAST);
        panelBotones.add(new JButton("OESTE"), BorderLayout.WEST);
        panelBotones.add(new JButton("CENTRO"), BorderLayout.CENTER);
        refrescar();
    }

    private void aplicarGridLayout() {
        panelBotones.removeAll();
        panelBotones.setLayout(new GridLayout(2, 3, 10, 10)); // 2 filas, 3 columnas
        for (int i = 1; i <= 6; i++) {
            panelBotones.add(new JButton("Botón " + i));
        }
        refrescar();
    }

    private void aplicarBoxLayout() {
        panelBotones.removeAll();
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.Y_AXIS));
        for (int i = 1; i <= 5; i++) {
            panelBotones.add(new JButton("Botón " + i));
            panelBotones.add(Box.createRigidArea(new Dimension(0, 10))); // Espaciado vertical
        }
        refrescar();
    }

    private void refrescar() {
        panelBotones.revalidate(); // Recalcula el layout
        panelBotones.repaint();    // Repinta la ventana
    }

    public static void main(String[] args) {
         new EjemploLayouts();
    }
}

