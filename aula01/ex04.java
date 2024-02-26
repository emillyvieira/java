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
public class ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float v, j, c, t, i, p;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do imovel...");
        System.out.print("R$  ");
        c = sc.nextInt();
        
        System.out.println("Digite a taxa de juros...(em %)");
        System.out.print("i: ");
        i = sc.nextInt();
        
        System.out.println("Digite o tempo de aplicacao...(em meses)");
        System.out.print("t:  ");
        t = sc.nextInt();
        
        j = c * (i/100) * t;
        v = c + j;
        p = v / t;
        
        System.out.println("Juros: R$ " + String.format("%.2f", + j));
        System.out.println("Valor do imovel com juros: R$ " + String.format("%.2f", + v));
        System.out.println("Prestacao: R$ " + String.format("%.2f", p));
    }
}
