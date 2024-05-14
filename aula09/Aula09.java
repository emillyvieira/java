/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3028569
 */
public class Aula09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número", "Calcula o Dobro", JOptionPane.INFORMATION_MESSAGE));
            JOptionPane.showInputDialog(null, "O dobro de " + num + " é " + num * 2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showInputDialog(null, "Formato Inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

}
