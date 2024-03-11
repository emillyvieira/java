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
public class ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        double premio, sena, quina, quadra;

        System.out.println("Digite o valor do premio: ");
        premio = sc.nextDouble();

        sena = (premio * 60) / 100;
        quina = (premio * 30) / 100;
        quadra = (premio * 10) / 100;

        System.out.println("Premio total: R$ " + premio +"\nSena: R$ "+sena + "\nQuina: R$" + quina + "\nQuadra: R$" + quadra);
    }
    
}
