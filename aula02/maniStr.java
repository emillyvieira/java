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
public class maniStr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, j;
        String str[] = 
        {
            "Olha que coisa mais linda", 
            "Mais cheia de graça",
            "É ela a menina que vem e que passa",
            "Num doce balanço a caminho do mar",
            "Moça do corpo dourado do sol de Caraguatatuba"
        };
        for ( i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, "String: " + (i + 1) + ": " + str[i]);
        }
        for ( i = 0; i < 5; i++) {
            for ( j = 0; j < str[i].length(); j++) {
                JOptionPane.showMessageDialog(null, "char [" + i + ", " + j + ", " + str[i].charAt(j));
            }
        
        }
    }
}
