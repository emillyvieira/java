/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05p1;

/**
 *
 * @author cg3028569
 */
public class ContaPoupanca extends Conta{

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }
    
    @Override
    public void taxa() {
        this.saldo -= 10.0;

        System.out.println("O novo saldo após a cobrança de taxa é de R$" + saldo);
    }
}
