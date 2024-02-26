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
public class ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo de tres dígitos (de 100 ate 999):");
        int numero = scanner.nextInt();

        int digitoCentena = numero / 100;
        int digitoDezena = (numero % 100) / 10;
        int digitoUnidade = numero % 10;

        int numeroInvertido = (digitoUnidade * 100) + (digitoDezena * 10) + digitoCentena;

        System.out.println("Numero invertido: " + numeroInvertido);
    }
}
