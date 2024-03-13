/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03ex;

import javax.swing.JOptionPane;

/**
 *
 * @author emilly
 */
public class ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Solicitando dados ao usuário usando JOptionPane
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês:"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));

        // Criando objeto Data com os valores fornecidos
        Data data1 = new Data(dia, mes, ano);
        JOptionPane.showMessageDialog(null, "Data 1: " + data1.toString());

        // Avançando para o próximo dia
        data1.proximoDia();
        JOptionPane.showMessageDialog(null, "Próximo dia da Data 1: " + data1.toString());

        // Criando objeto Data com a data atual
        Data data2 = new Data();
        JOptionPane.showMessageDialog(null, "Data 2 (atual): " + data2.toString());

        // Comparando datas
        int comparacao = data1.compararData(data2);
        switch (comparacao) {
            case 0 -> JOptionPane.showMessageDialog(null, "As datas são iguais.");
            case 1 -> JOptionPane.showMessageDialog(null, "Data 1 é maior que Data 2.");
            default -> JOptionPane.showMessageDialog(null, "Data 2 é maior que Data 1.");
        }
    }
}
