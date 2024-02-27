/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03ex;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3028569
 */
public class ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de alunos para cadastrar: "));

        Aluno[] a = new Aluno[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = new Aluno();
        }

        for (int i = 0; i < a.length; i++) {
            a[i].setMatricula(JOptionPane.showInputDialog(null, (i + 1) + ") Digite a matricula do aluno: "));
            a[i].setNome(JOptionPane.showInputDialog(null, (i + 1) + ") Digite o nome do aluno: "));
            a[i].setP1(Float.parseFloat(JOptionPane.showInputDialog(null, (i + 1) + ") Digite a nota da P1: ")));
            a[i].setP2(Float.parseFloat(JOptionPane.showInputDialog(null, (i + 1) + ") Digite a nota da P2: ")));
            a[i].setT1(Float.parseFloat(JOptionPane.showInputDialog(null, (i + 1) + ") Digite a nota do T1: ")));
            a[i].setNf(a[i].CalculoMedia(a[i].getP1(), a[i].getP2(), a[i].getT1()));

            JOptionPane.showMessageDialog(null, "Nota final do(a) aluno(a) " + a[i].nome + ": " + a[i].nf);
            if (a[i].nf < 6) {
                JOptionPane.showMessageDialog(null, "Nota necessaria na prova de recuperação: " + a[i].Rec(a[i].getNf()));
            }
        }

    }

}
