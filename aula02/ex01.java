/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3028569
 */
public class ex01 {

    /**
     * @param args the command line arguments
     */
    public static int trunca(double x) {
        int n = (int) x;
        return n;
    }

    public static int quociente(int a, int b) {
        int q = a / b;
        return q;
    }

    public static int resto(int a, int b) {
        int r = a % b;
        return r;
    }

    public static void main(String[] args) {
        int M, D, A, S, diaSemana;

        M = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do mês: "));
        D = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do mês: "));
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite os dois últimos algarismos do ano: "));
        S = Integer.parseInt(JOptionPane.showInputDialog("Digite os dois primeiros algarismos do ano: "));

        diaSemana = resto((trunca(2.6 * M - 0.1) + D + A + quociente(A, 4) + quociente(S, 4) - 2 * S), 7);

        String[] diasSemana = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
        JOptionPane.showMessageDialog(null, "O dia da semana é " + diasSemana[diaSemana]);
    }
}
