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
public class ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float premio, sena, quina, quadra;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do premio da aposta...");
        System.out.print("R$  ");
        premio = sc.nextInt();

        sena = (premio * 60) / 100;
        quina = (premio * 30) / 100;
        quadra = (premio * 10) / 100;

        System.out.println("Sena: R$ " + sena);
        System.out.println("Quina: R$ " + quina);
        System.out.println("Quadra: R$ " + quadra);
    }
}
