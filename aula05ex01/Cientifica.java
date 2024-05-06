/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05ex01;

/**
 *
 * @author cg3028569
 */
public class Cientifica extends Calculadora {
    @Override
    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double divisao(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
        return num1 / num2;
    }

    @Override
    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public double raizQuadrada(double num) {
        return Math.sqrt(num);
    }

    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}
