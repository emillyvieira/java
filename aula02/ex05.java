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
public class ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog(null, "Crie sua senha:");

        if (verificaSenha(senha)) {
            JOptionPane.showMessageDialog(null, "Senha válida.");
        } else {
            JOptionPane.showMessageDialog(null, "A senha não atende aos critérios de segurança.");
        }
    }

    public static boolean verificaSenha(String senha) {
        if (senha.length() < 8) {
            return false;
        }

        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;
        boolean temEspecial = false;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            } else if (Character.isLowerCase(c)) {
                temMinuscula = true;
            } else if (Character.isDigit(c)) {
                temNumero = true;
            } else if (!Character.isLetterOrDigit(c)) {
                temEspecial = true;
            }
        }

        return temMaiuscula && temMinuscula && temNumero && temEspecial;
    }
}
