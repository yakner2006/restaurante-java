/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import javax.swing.*;
public class JavaApplication5 {

    public static void main(String[] args) {
         JFrame ventana = new JFrame("Pedido Restaurante");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 250);
        ventana.setLayout(null);
        ventana.setLocationRelativeTo(null);

        JLabel lbCliente = new JLabel("Cliente:");
        lbCliente.setBounds(20, 20, 100, 30);
        JTextField txtCliente = new JTextField(15);
        txtCliente.setBounds(120, 20, 150, 30);

        JLabel lbProducto = new JLabel("Producto:");
        lbProducto.setBounds(20, 60, 100, 30);
        JComboBox<String> cbProducto = new JComboBox<>(new String[]{"Pizza", "Hamburguesa", "Bebida"});
        cbProducto.setBounds(120, 60, 150, 30);

        JLabel lbCantidad = new JLabel("Cantidad:");
        lbCantidad.setBounds(20, 100, 100, 30);
        JSpinner spnCantidad = new JSpinner(new SpinnerNumberModel(1, 1, 20, 1));
        spnCantidad.setBounds(120, 100, 60, 30);

        JButton btRegistrar = new JButton("Registrar Pedido");
        btRegistrar.setBounds(120, 150, 150, 30);

        ventana.add(lbCliente);
        ventana.add(txtCliente);
        ventana.add(lbProducto);
        ventana.add(cbProducto);
        ventana.add(lbCantidad);
        ventana.add(spnCantidad);
        ventana.add(btRegistrar);

        ventana.setVisible(true);
    }
}
