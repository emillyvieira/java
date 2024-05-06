/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06ex03;

/**
 *
 * @author emilly
 */
public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws SaldoException {
        if (valor > saldo) {
            throw new SaldoException("Saldo insuficiente");
        }
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

}
