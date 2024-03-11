/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revisao.classe;

import javax.swing.JOptionPane;

/**
 *
 * @author emilly
 */
public class ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos aluno sdeseja cadastrar?"));

        Aluno[] a = new Aluno[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = new Aluno();
        }

        for (int i = 0; i < a.length; i++) {
            a[i].setMatricula(JOptionPane.showInputDialog(null, "Matricula"));
            a[i].setNome(JOptionPane.showInputDialog(null, "Nome"));
            a[i].setP1(Integer.parseInt(JOptionPane.showInputDialog(null, "Nota p1")));
            a[i].setP2(Integer.parseInt(JOptionPane.showInputDialog(null, "Nota p2")));
            a[i].setT1(Integer.parseInt(JOptionPane.showInputDialog(null, "Nota trabalho")));
            a[i].setNf(a[i].media(a[i].getP1(), a[i].getP2(), a[i].getT1()));

            JOptionPane.showMessageDialog(null, "Nota final: " + a[i].nf);
            if (a[i].nf < 6) {
                JOptionPane.showMessageDialog(null, "Nota necessaria na prova de recuperacao: " + a[i].rec(a[i].getNf()));
            }
        }

    }

}
