/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {

   
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         
       System.out.print("Ingrese el número de un mes (1-12): ");
        int mes = sc.nextInt();
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("El mes tiene 31 días.");
            case 4, 6, 9, 11 -> System.out.println("El mes tiene 30 días.");
            case 2 -> System.out.println("Febrero tiene 28 días (29 si es año bisiesto).");
            default -> System.out.println("Número de mes inválido.");
        }
    }
} 
        
    
    

