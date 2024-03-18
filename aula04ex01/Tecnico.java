/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04ex01;

/**
 *
 * @author emilly
 */
public class Tecnico extends Assistente {
    private double bonus;

    public Tecnico(String nome, double salario, int numeroMatricula, double bonus) {
        super(nome, salario, numeroMatricula);
        this.bonus = bonus;
    }

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + bonus;
    }
}
