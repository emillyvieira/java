/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02;

import javax.swing.JOptionPane;

/**
 *
 * @author emilly
 */
public class ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a ordem da matriz quadrada: "));

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String input = JOptionPane.showInputDialog("Digite o elemento [" + (i + 1) + "," + (j + 1) + "]: ");
                matriz[i][j] = Integer.parseInt(input);
            }
        }

        int max = Integer.MIN_VALUE;
        int maxI = 0, maxJ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }

        int minimax = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            minimax = Math.min(minimax, matriz[maxI][j]);
        }

        JOptionPane.showMessageDialog(null, "Elemento minimax: " + minimax);
    }
}