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
public class exfor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int f, n, num;
        JOptionPane.showMessageDialog(null, "CALCULO FATORIAL");
        num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número: "));
        n = num;

        for (f = 1; n >= 1; n--) {
            f = f * n;
        }
        JOptionPane.showMessageDialog(null, num + "! = " + f);
    }

}
