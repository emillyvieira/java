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
public class ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, m, c = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero de 1 à 99: "));
        } while (n > 99 || n < 1);

        Random random = new Random();

        do {
            c++;
            m = random.nextInt(99)+1;
            JOptionPane.showMessageDialog(null, "Chute n° " + c + "\n Numero : " + m);
            
        }  while (n != m);

        JOptionPane.showMessageDialog(null, "Foram necessários " + c + " chutes até adivinhar o número: " + n);
    }

}
