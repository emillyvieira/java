/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05p2;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3028569
 */
public class ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
            int y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
            JOptionPane.showInputDialog(null, x + " / " + y + " = " + x/y);
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, " Formato inválido!\n\n "
                    + "Detalhes do erro: " + e.getMessage());
        }
        catch(ArithmeticException e) {
            JOptionPane.showMessageDialog(null, " Operação inválida!\n\n "
                    + "Detalhes do erro: " + e.getMessage());
        }
        finally {
            JOptionPane.showMessageDialog(null, "Execução concluída!");
        }
        
    }
    
}
