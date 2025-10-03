/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication_yakner;

import java.util.Scanner;

public class JavaApplication_yakner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingre la nota1");

        double nota1 = sc.nextDouble();

        System.out.println("ingre la nota2");

        double nota2 = sc.nextDouble();

        System.out.println("ingre la nota3");
        
       
        double nota3 = sc.nextDouble();
        
       
        String nombre = "yakner";

        double promedio = (nota1 + nota2 + nota3) / 3;
        
        if (promedio >= 18 && promedio <= 20) {
            System.out.println(" el alumno " + nombre + " tiene buenas notas merece baca y tiene " + promedio + " de promedio ");
        }else if( promedio >= 14 && promedio < 18){
            System.out.println(" el alumno " + nombre + " tiene dedicarse un poco mas a sus estudios, tiene " + promedio + " de promedio ");
        }else if(promedio >= 12 && promedio < 14){
            System.out.println("el alumno " + nombre + " tiene que mejorar en tus notas, tiene "+ promedio + " de promedio");
        }else if(promedio >= 0 && promedio < 12){
            System.out.println("el  alumno. " + nombre + " reaprueba del curso, esta pesimo en us notas, tiene " + promedio +" de promedio");
        }else{
            System.out.println("las notas ingresados estan fuera del rango, intente de nuevo");
        }

    }

}
