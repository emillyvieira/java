/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05ex03;

/**
 *
 * @author emilly
 */
public class SeguroDeVida implements Tributavel {
    private double valorSeguro;

    public SeguroDeVida(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    @Override
    public double calculaTributos() {
        return 42; // taxa fixa de 42 reais
    }
}