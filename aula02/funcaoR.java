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
public class funcaoR {

    /**
     * @param args the command line arguments
     */
    public static int fat(int n) {
        // TODO code application logic here
        int f;

        if (n > 1) {
            f = n * fat(n - 1);
        } else {
            f = 1;
        }
        return f;
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        JOptionPane.showMessageDialog(null, "CALCULO FATORIAL");
        num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número: "));

        JOptionPane.showMessageDialog(null, num + "! = " + fat(num));
    }

}
