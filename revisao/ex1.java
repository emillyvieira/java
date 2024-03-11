/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revisao;

import java.util.Scanner;

/**
 *
 * @author emilly
 */
public class ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float c, f;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o valor dos graus em Fahrenheit: ");
        f = sc.nextFloat();
        
        c = (float) (5.0/9.0*(f-32.0));
        
        System.out.println("A conversao para celsius fica: "+c+" graus");
        
        
        
    }
    
}
