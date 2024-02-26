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
public class ex02v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int d, m, a;
        do {
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano"));
        } while (a < 1);

        do {
            m = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o mês"));
        } while (m < 1 || m > 12);

        if (m == 2) {
            if (ehBissexto(a)) {
                do {
                    d = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o dia"));
                } while (d < 1 || d > 29);
            } else {
                do {
                    d = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o dia"));
                } while (d < 1 || d > 28);
            }
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            do {
                d = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o dia"));
            } while (d < 1 || d > 30);
        } else {
            do {
                d = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o dia"));
            } while (d < 1 || d > 31);
        }
        JOptionPane.showMessageDialog(null, "A data digitada é " + d + "/" + m + "/" + a);
    }

    public static boolean ehBissexto(int ano) {
        return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
    }
}
