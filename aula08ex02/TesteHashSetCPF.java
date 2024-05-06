/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08ex02;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author emilly
 */
public class TesteHashSetCPF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        HashSet<String> cpfSet = new HashSet<>();

        System.out.println("Digite 10 CPFs:");

        for (int i = 0; i < 10; i++) {
            System.out.print("CPF " + (i + 1) + ": ");
            String cpf = scanner.nextLine();
            cpfSet.add(cpf);
        }

        System.out.println("\nCPF adicionados no HashSet:");
        for (String cpf : cpfSet) {
            System.out.println(cpf);
        }

        scanner.close();

    }

}
