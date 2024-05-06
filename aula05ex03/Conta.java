/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05ex03;

/**
 *
 * @author emilly
 */
public class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public double obterSaldo() {
        return saldo;
    }
}
