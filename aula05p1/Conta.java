/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05p1;

/**
 *
 * @author cg3028569
 */
public abstract class Conta {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }
    
    public void deposita(double valor){
        this.saldo += valor;
        
        System.out.println("O novo saldo da conta é de R$"+ saldo);
    }
    
    public abstract void taxa();
}
