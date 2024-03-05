/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04ex;

/**
 *
 * @author cg3028569
 */
public class Funcionario {
    String nome;
    double salario;
    
    public double addAumento(double valor) {
        return salario+valor;
    }
    
    public double ganhoAnual(){
        return salario* 12;
    }
    
    public exibeDados(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
