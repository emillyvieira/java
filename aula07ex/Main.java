/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07ex;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author cg3028569
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herepublic static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número para gerar a tabuada:");
        int numero = Integer.parseInt(input);

        String nomeArquivo = "tabuada_" + numero + ".txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo))) {
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                writer.println(numero + " x " + i + " = " + resultado);
            }
            JOptionPane.showMessageDialog(null, "Tabuada gerada e armazenada no arquivo " + nomeArquivo);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

}
