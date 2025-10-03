/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import javax.swing.*;
import java.awt.*;
public class JavaApplication4 {

    
    public static void main(String[] args) {
        
        
          JFrame frame = new JFrame("Registro de Pedido");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setLayout(new FlowLayout());

        JLabel IbCliente = new JLabel("Cliente:");
        JTextField txtcliente = new JTextField(15);

        JLabel IbProducto = new JLabel("Producto:");
        JComboBox<String> CbProducto = new JComboBox<>(new String[]{"pizza", "hamburguesa", "bebida"});

        JLabel IbCantidad = new JLabel("Cantidad:");
        JSpinner spnCantidad = new JSpinner(new SpinnerNumberModel(1, 1, 20, 1));

        JButton btRegistrar = new JButton("Registrar pedido");

        btRegistrar.addActionListener(e -> {
            String cliente = txtcliente.getText();
            String producto = (String) CbProducto.getSelectedItem();
            int cantidad = (int) spnCantidad.getValue();

            JOptionPane.showMessageDialog(frame,
                    "Pedido registrado:\nCliente: " + cliente +
                    "\nProducto: " + producto +
                    "\nCantidad: " + cantidad,
                    "Confirmación",
                    JOptionPane.INFORMATION_MESSAGE);
        });

        frame.add(IbCliente);
        frame.add(txtcliente);
        frame.add(IbProducto);
        frame.add(CbProducto);
        frame.add(IbCantidad);
        frame.add(spnCantidad);
        frame.add(btRegistrar);

        frame.setVisible(true);
    

    }
    
}
