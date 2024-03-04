/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author emilly
 */
public class ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();

        int jC, jP;
        do {
            jP = Integer.parseInt(JOptionPane.showInputDialog(null, "Jokenpoh...\n 0- pedra 1-papel 2-tesoura"));
        } while (jP < 0 || jP > 2);
        jC = random.nextInt(3);

        if (jC == 0) {
            switch (jP) {
                case 0 -> JOptionPane.showMessageDialog(null, "Empate.");
                case 1 -> JOptionPane.showMessageDialog(null, "Jogador ganhou.");
                default -> JOptionPane.showMessageDialog(null, "Jogador perdeu.");
            }
        }

        if (jC == 1) {
            switch (jP) {
                case 1 -> JOptionPane.showMessageDialog(null, "Empate.");
                case 2 -> JOptionPane.showMessageDialog(null, "Jogador ganhou.");
                default -> JOptionPane.showMessageDialog(null, "Jogador perdeu.");
            }
        }

        if (jC == 2) {
            switch (jP) {
                case 2 -> JOptionPane.showMessageDialog(null, "Empate.");
                case 0 -> JOptionPane.showMessageDialog(null, "Jogador ganhou.");
                default -> JOptionPane.showMessageDialog(null, "Jogador perdeu.");
            }
        }

    }
}
