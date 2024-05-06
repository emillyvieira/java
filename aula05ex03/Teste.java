/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05ex03;

/**
 *
 * @author emilly
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000);
        SeguroDeVida seguroDeVida = new SeguroDeVida(50000);

        System.out.println("Tributo da Conta Corrente: " + contaCorrente.calculaTributos());
        System.out.println("Tributo do Seguro de Vida: " + seguroDeVida.calculaTributos());
    }
    
}
