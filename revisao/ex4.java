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
public class ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        double c, t, i, j, total, prestacao;

        System.out.println("Digite o valor do imovel: ");
        c = sc.nextDouble();
        System.out.println("Digite o tempo: ");
        t = sc.nextDouble();
        System.out.println("Digite a taxa do juros: ");
        i = sc.nextDouble();
        
        j = c * (i/100) * t;
        total = c + j;
        prestacao = total / t;
        
        System.out.println("Total com juros: R$"+String.format("%.2f", + total)+"\nPrestacao: R$"+String.format("%.2f", + prestacao));
        

    }

}
