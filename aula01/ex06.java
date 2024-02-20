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
public class ex06 {

    /**
     * @param args the command line arguments
     */
    public static float adicao(float a, float b) {
        float n;
        n = a + b;
        return n;
    }
    public static float subtracao(float a, float b) {
        float n;
        n = a - b;
        return n;
    }
    public static float multiplicacao(float a, float b) {
        float n;
        n = a * b;
        return n;
    }
    public static float divisao(float a, float b) {
        float n;
        n = a / b;
        return n;
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        float adicao, subtracao, multiplicacao, divisao, a, b;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        a = sc.nextFloat();
        System.out.print("Digite o segundo numero: ");
        b = sc.nextFloat();
        
        System.out.println("Adicao de " + a + " e " + b + " = " + adicao(a, b));
        System.out.println("Subtracao de " + a + " e " + b + " = " + subtracao(a, b));
        System.out.println("Multiplicacao de " + a + " e " + b + " = " + multiplicacao(a, b));
        System.out.println("Divisao de " + a + " e " + b + " = " + divisao(a, b));

        
    }

}
