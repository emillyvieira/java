/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula01;

import java.util.Scanner;

/**
 *
 * @author cg3028569
 */
public class ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float f, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os graus em Fahrenheit: ");
        f = sc.nextFloat();
        c = (float) (5.0 / 9.0 * (f - 32.0));

        System.out.println("Graus em Celsius: " + c);
    }
}
