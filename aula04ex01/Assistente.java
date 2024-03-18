/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04ex01;

/**
 *
 * @author cg3028569
 */
public class Assistente extends Funcionario {
    private int numeroMatricula;

    public Assistente(String nome, double salario, int numeroMatricula) {
        super(nome, salario);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public void exibeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Número de Matrícula: " + numeroMatricula);
    }
}
