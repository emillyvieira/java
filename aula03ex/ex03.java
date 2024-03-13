/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03ex;

import javax.swing.JOptionPane;

public class ex03 {

    static Conta[] c;

    /**
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        c = new Conta[1];

        for (int i = 0; i < c.length; i++) {
            c[i] = new Conta();

            c[i].setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog(null, "Numero da conta: ")));
            c[i].setSaldo(Double.valueOf(JOptionPane.showInputDialog(null, "Saldo da conta: R$ 0,00 \n Insira o valor do primeiro depósito: ")));

            while (true) {
                menu(i);
            }
        }
    }

    public static void menu(int i) {
        String[] opcoes = {"Extrato", "Saque", "Deposito", "Finalizar"};

        int opcao = JOptionPane.showOptionDialog(null,
                "O que deseja fazer?",
                "Conta: " + c[i].getNumeroConta(),
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        switch (opcao) {
            case 0 -> {
                // extrato
                c[i].extrato();
            }
            case 1 -> {
                // Saque
                double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor para Saque: R$"));
                c[i].saque(valor);
            }
            case 2 -> {
                // Deposito
                double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor para Deposito: R$"));
                c[i].deposito(valor);
            }
            case 3 -> {
                // Finalizar
                JOptionPane.showMessageDialog(null, "Obrigado por utilizar o sistema!");
                System.exit(0);
            }
            default -> // Opção inválida
                JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    }
}
