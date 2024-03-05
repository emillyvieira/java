/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04ex;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3028569
 */
public class ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de funcionarios para cadastrar: " ));
        
        Funcionario[] f  = new Funcionario[n];
                      
        for (int i = 0; i < n; i++) {
            f[i].setNome(JOptionPane.showInputDialog(null, "Digite o nome: " ));
            f[i].setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salario: ")));
            
            
        }
        

    }

   
}
