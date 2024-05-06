/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula06ex01;

/**
 *
 * @author emilly
 */
public class TestException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Início do main");

        metodo1();

        System.out.println("Fim do main");
    }

    static void metodo1() {
        System.out.println("Início do metodo1");

        metodo2();

        System.out.println("Fim do metodo1");
    }

    static void metodo2() {
        System.out.println("Início do metodo2");

        int[] array = new int[10];

        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = 1;
                System.out.println(1);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Erro: índice de array inválido");
        }

        System.out.println("Fim do metodo2");

    }

}
