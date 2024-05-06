/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula06ex03;

/**
 *
 * @author emilly
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta conta = new Conta(1000);

        try {
            System.out.println("Saldo inicial: " + conta.getSaldo());
            conta.sacar(500);
            System.out.println("Saldo após sacar 500: " + conta.getSaldo());
            conta.depositar(200);
            System.out.println("Saldo após depositar 200: " + conta.getSaldo());
            conta.sacar(2000); // Isso deverá lançar uma SaldoException
            System.out.println("Saldo após sacar 2000: " + conta.getSaldo()); // Esta linha não será executada
        } catch (SaldoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
