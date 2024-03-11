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
public class ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int d, m, a, i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Anos: ");
        a = sc.nextInt();
        System.out.println("Meses: ");
        m = sc.nextInt();
        System.out.println("Dias: ");
        d = sc.nextInt();

        i = (a * 365) + (m * 30) + d;
        System.out.println("Idade em dias: " + i);
    }

}
