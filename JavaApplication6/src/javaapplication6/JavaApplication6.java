/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;
import javax.swing.*;
import java.awt.*;
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   JFrame frame = new JFrame("Cálculo de IGV");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JLabel IblMonto = new JLabel("Monto:");
        JTextField txtMonto = new JTextField(10);

        JLabel IblIGV = new JLabel("IGV (18%):");
        JLabel IblTotal = new JLabel("Total:");

        JButton btnCalcular = new JButton("Calcular");

        btnCalcular.addActionListener(e -> {
            try {
                double monto = Double.parseDouble(txtMonto.getText());
                double igv = monto * 0.18;
                double total = monto + igv;

                IblIGV.setText("IGV (18%): " + igv);
                IblTotal.setText("Total: " + total);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Ingrese un monto válido", 
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.add(IblMonto);
        frame.add(txtMonto);
        frame.add(btnCalcular);
        frame.add(IblIGV);
        frame.add(IblTotal);

        frame.setVisible(true);
        }
    
}
