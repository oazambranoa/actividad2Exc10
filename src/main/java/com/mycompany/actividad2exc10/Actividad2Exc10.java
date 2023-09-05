/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2exc10;

/**
 *
 * @author omarz
 */

/*Enunciado
    Ejercicio resuelto Nº 15
Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que tres son de igual peso y una
diferente. Elaborar un algoritmo que determine cuál es la esfera diferente y si es de mayor
o menor peso. 
*/

import java.util.Scanner;

public class Actividad2Exc10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso de la esfera A: ");
        double pesoA = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera B: ");
        double pesoB = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera C: ");
        double pesoC = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera D: ");
        double pesoD = scanner.nextDouble();

        if (pesoA == pesoB && pesoA == pesoC) {
            if (pesoD > pesoA) {
                System.out.println("La esfera D es la diferente y es de mayor peso.");
            } else {
                System.out.println("La esfera D es la diferente y es de menor peso.");
            }
        } else if (pesoA == pesoB && pesoA == pesoD) {
            System.out.println("La esfera C es la diferente.");
            if (pesoC > pesoA) {
                System.out.println("Y es de mayor peso.");
            } else {
                System.out.println("Y es de menor peso.");
            }
        } else if (pesoA == pesoC && pesoA == pesoD) {
            System.out.println("La esfera B es la diferente.");
            if (pesoB > pesoD) {
                System.out.println("Y es de mayor peso.");
            } else {
                System.out.println("Y es de menor peso.");
            }
        } else {
            System.out.println("La esfera A es la diferente.");
            if (pesoA > pesoB) {
                System.out.println("Y es de mayor peso.");
            } else {
                System.out.println("Y es de menor peso.");
            }
        }

        scanner.close();
    }
}
