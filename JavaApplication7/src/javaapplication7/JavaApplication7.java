/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;
import javax.swing.*;
import java.awt.*;
public class JavaApplication7 {

    public static void main(String[] args) {
         JFrame frame = new JFrame("Reporte de Ventas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        JComboBox<String> cbReporte = new JComboBox<>(new String[]{
            "venta por día", "venta por mes", "producto más vendido"
        });

        JButton btnGenerar = new JButton("Generar reporte");

        JTextArea txtReporte = new JTextArea(10, 30);
        txtReporte.setEditable(false);

        JScrollPane scrollReporte = new JScrollPane(txtReporte);

        btnGenerar.addActionListener(e -> {
            String opcion = (String) cbReporte.getSelectedItem();
            txtReporte.setText("Generando " + opcion + "...\n");
            txtReporte.append("Aquí iría el resultado del reporte.");
        });

        frame.add(cbReporte);
        frame.add(btnGenerar);
        frame.add(scrollReporte);

        frame.setVisible(true);
    }
    
}
