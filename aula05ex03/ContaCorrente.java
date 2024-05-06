/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05ex03;

/**
 *
 * @author emilly
 */
public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double calculaTributos() {
        return saldo * 0.01; // 1% do saldo
    }
}
