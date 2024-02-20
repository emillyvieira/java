/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;

import java.util.Scanner;

/**
 *
 * @author cg3028569
 */
public class Classe01 {
    
    public static void main(String[] args) {
        
        int num1, num2, res;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextInt();
        res = (num1 + num2) * num2 * num2;
        
        System.out.println("Resposta: " + res);
    }
}
