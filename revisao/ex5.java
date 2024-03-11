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
public class ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite o numero: ");
        num = sc.nextInt();

        int digitoCentena = num / 100;
        int digitoDezena = (num % 100) / 10;
        int digitoUnidade = num % 10;

        int numeroInvertido = digitoCentena + digitoDezena * 10 + digitoUnidade * 100;

        System.out.println("Numero invertido: " + numeroInvertido);
    }

}
