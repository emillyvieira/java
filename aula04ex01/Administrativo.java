/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04ex01;

/**
 *
 * @author emilly
 */
public class Administrativo extends Assistente {
    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, int numeroMatricula, String turno, double adicionalNoturno) {
        super(nome, salario, numeroMatricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public double ganhoAnual() {
        double salarioAnual = super.ganhoAnual();
        if (turno.equals("noite")) {
            salarioAnual += adicionalNoturno * 12;
        }
        return salarioAnual;
    }
}
