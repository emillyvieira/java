/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author emilly
 */
public class CalculoQuadrado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputValido = false;
        double numero = 0;

        while (!inputValido) {
            try {
                System.out.print("Digite um número: ");
                numero = scanner.nextDouble();
                inputValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Opa... Acho que você se enganou! Digite novamente...");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }

        double quadrado = numero * numero;
        System.out.println("O quadrado de " + numero + " é: " + quadrado);

        scanner.close();
    }

}
