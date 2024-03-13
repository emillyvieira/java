/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03ex;

import javax.swing.JOptionPane;

/**
 *
 * @author emilly
 */
public class Conta {

    private int numeroConta;
    private double saldo;

    public void extrato() {
        JOptionPane.showMessageDialog(null, "Número da Conta: " + numeroConta + "\nSaldo: R$" + saldo);
    }

    public void saque(double valor) {
        if (valor > saldo) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        } else {
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque: R$ " + valor+ "\nSaldo atual: R$ " + saldo);
        }
    }
    
    public void deposito(double valor) {
        saldo += valor;
        JOptionPane.showMessageDialog(null, "Deposito: R$" + valor + "nSaldo: R$" + saldo);
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
}
