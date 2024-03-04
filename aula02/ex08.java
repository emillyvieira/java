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
public class ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento " + (i + 1) + " do vetor:"));
        }

        ordenaVetor(vetor);

        String resultado = "Vetor ordenado: ";
        for (int num : vetor) {
            resultado += num + " ";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void ordenaVetor(int[] vetor) {
        int n = vetor.length;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // troca vetor[j] e vetor[j+1]
                    temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}
