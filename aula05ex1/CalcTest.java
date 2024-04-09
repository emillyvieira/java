/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05ex1;

/**
 *
 * @author cg3028569
 */
public class CalcTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herepublic static void main(String[] args) {
        // Exemplo de utilização da calculadora científica
        Cientifica calc = new Cientifica();

        double num1 = 10;
        double num2 = 5;

        System.out.println("Soma: " + calc.soma(num1, num2));
        System.out.println("Subtração: " + calc.subtracao(num1, num2));
        System.out.println("Multiplicação: " + calc.multiplicacao(num1, num2));
        System.out.println("Divisão: " + calc.divisao(num1, num2));
        System.out.println("Raiz Quadrada de 16: " + calc.raizQuadrada(16));
        System.out.println("Potência de 2 elevado a 3: " + calc.potencia(2, 3));
    }

}
