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
public class ex6 {

    /**
     * @param a
     * @param b
     * @return
     */
    public static float adicao(float a, float b) {
        return a + b;
    }

    public static float subtracao(float a, float b) {
        return a - b;
    }

    public static float multiplicacao(float a, float b) {
        return a * b;
    }

    public static float divisao(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        float a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        a = sc.nextFloat();
        System.out.print("Digite o segundo numero: ");
        b = sc.nextFloat();

        System.out.println(a + " + " + b + " = " + adicao(a, b));
        System.out.println(a + " - " + b + " = " + subtracao(a, b));
        System.out.println(a + " * " + b + " = " + multiplicacao(a, b));
        System.out.println(a + " / " + b + " = " + divisao(a, b));

    }

}
