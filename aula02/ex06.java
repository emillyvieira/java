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
public class ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho dos vetores: "));

        int[] v1 = new int[size];
        int[] v2 = new int[size];
        int[] v3 = new int[size];

        // Get user input for elements of v1
        for (int i = 0; i < size; i++) {
            v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento " + (i + 1) + " do vetor 1: "));
        }

        // Get user input for elements of v2
        for (int i = 0; i < size; i++) {
            v2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento " + (i + 1) + " do vetor 2: "));
        }

        // Calculate the sum and store in v3
        for (int i = 0; i < size; i++) {
            v3[i] = v1[i] + v2[i];
        }

        // Display the final result
        String result = "V[1] = ";
        for (int i = 0; i < size; i++) {
            result += v1[i] + " ";
        }

        result += "\nV[2] = ";
        for (int i = 0; i < size; i++) {
            result += v2[i] + " ";
        }

        result += "\nV[3] = ";
        for (int i = 0; i < size; i++) {
            result += v3[i] + " ";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}
