/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3028569
 */
public class aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nomeArquivo = JOptionPane.showInputDialog("Entre com o nome do arquivo ou diretório: ");
        String texto;
        
        texto = ESArquivo.isArquivoPasta(nomeArquivo);
        JOptionPane.showMessageDialog(null, texto);
    
    }
    
}
