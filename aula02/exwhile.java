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
public class exwhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = null;
        int r = JOptionPane.NO_OPTION;
        while (r == JOptionPane.NO_OPTION) {
            nome = JOptionPane.showInputDialog(null, "Qual seu nome? ");
            JOptionPane.showMessageDialog(null, "Bem vindo(a) " + nome + "!");
            r = JOptionPane.showConfirmDialog(null, "Seu nome esta correto? " + nome + "?");
        }
        if (r == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Obrigado por confirmar! Seu nome é " + nome);
        }

    }

}
