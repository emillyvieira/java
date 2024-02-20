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
public class exarrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vetor[] = new int[5];
        int aux, i;
        
        JOptionPane.showMessageDialog(null, "Entre com 5 numeros: ");
        for (i = 0; i < 5; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "vetor[" + i + "]: "));
        }
        aux = vetor[0];
        i=1;
        while (i<5) {
            if (vetor[i] >= aux) {
                aux = vetor[i];
            }
            i++;
        }
        
        JOptionPane.showMessageDialog(null, "Maior numero: " +aux);
        
        
    }
    
}
