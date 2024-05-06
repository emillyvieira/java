/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05ex04;

import java.util.Arrays;

/**
 *
 * @author emilly
 */
public class Supermercado {

    public static void main(String[] args) {
        // Criando arrays para cada tipo específico de produto
        Shampoo[] shampoos = new Shampoo[3];
        Biscoito[] biscoitos = new Biscoito[3];
        Leite[] leites = new Leite[3];

        // Criando algumas instâncias e colocando dentro dos arrays
        shampoos[0] = new Shampoo("Shampoo A", 10.0, 5);
        shampoos[1] = new Shampoo("Shampoo B", 8.0, 4);
        shampoos[2] = new Shampoo("Shampoo C", 12.0, 6);

        biscoitos[0] = new Biscoito("Biscoito X", 3.0, 10);
        biscoitos[1] = new Biscoito("Biscoito Y", 4.0, 8);
        biscoitos[2] = new Biscoito("Biscoito Z", 5.0, 12);

        leites[0] = new Leite("Leite 1L", 2.5, 5);
        leites[1] = new Leite("Leite 2L", 4.0, 10);
        leites[2] = new Leite("Leite 500ml", 1.5, 3);

        // Comparando todos os produtos de um mesmo tipo entre si
        Arrays.sort(shampoos);
        Arrays.sort(biscoitos);
        Arrays.sort(leites);

        // Indicando quem tem maior custo-benefício
        System.out.println("Shampoos (maior custo-benefício primeiro):");
        for (Shampoo shampoo : shampoos) {
            System.out.println(shampoo.nome + ": " + shampoo.calcularCustoBeneficio());
        }

        System.out.println("\nBiscoitos (maior custo-benefício primeiro):");
        for (Biscoito biscoito : biscoitos) {
            System.out.println(biscoito.nome + ": " + biscoito.calcularCustoBeneficio());
        }

        System.out.println("\nLeites (maior custo-benefício primeiro):");
        for (Leite leite : leites) {
            System.out.println(leite.nome + ": " + leite.calcularCustoBeneficio());
        }
    }

}
