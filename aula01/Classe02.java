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
public class Classe02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float a1, a2, peso1, peso2, nf;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a p1: ");
        a1 = sc.nextFloat();
        
        System.out.print("Digite a p2: ");
        a2 = sc.nextFloat();
        
        System.out.println("Digite o peso 1: ");
        peso1 = sc.nextFloat();
        
        peso2 = 10 - peso1;
        nf = (a1 * peso1 + a2 * peso2)/10;
        
        System.out.println("nota final: " + nf);
        
    }
    
}
