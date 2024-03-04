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
public class ex02 {

    public static void main(String[] args) {
        // Quantidade de funcionários
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de funcionários para cadastrar: "));

        // Cria um array de objetos Funcionario
        Funcionario[] f = new Funcionario[n];

        // Cadastro dos funcionários
        for (int i = 0; i < f.length; i++) {
            f[i] = new Funcionario();

            f[i].setNome(JOptionPane.showInputDialog(null, "Digite o nome do funcionário: "));
            f[i].setRg(JOptionPane.showInputDialog(null, "Digite o número de RG: "));
            f[i].setDepartamento(JOptionPane.showInputDialog(null, "Digite o departamento: "));
            f[i].setSalario(Double.valueOf(JOptionPane.showInputDialog(null, "Digite o salário: ")));
            f[i].setDataEntrada(JOptionPane.showInputDialog(null, "Digite a data de entrada na empresa (DD/MM/AAAA): "));
        }

        // Menu de opções para cada funcionário
        for (int i = 0; i < f.length; i++) {
            String[] opcoes = {"Aumento", "Ganho atual", "Finalizar"};

            JOptionPane.showMessageDialog(null, "Funcionário: " + f[i].getNome() + "\nRG: " + f[i].getRg() + "\nSalário: R$" + f[i].getSalario() + "\nData de entrada: " + f[i].getDataEntrada());

            int opcao = JOptionPane.showOptionDialog(null,
                    "O que deseja fazer?",
                    "Funcionário: " + f[i].getNome(),
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            switch (opcao) {
                case 0: // Aumento
                    double aumento = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do aumento: "));
                    f[i].recebeAumento(aumento);
                    JOptionPane.showMessageDialog(null, "Salário atualizado: R$" + f[i].getSalario());
                    break;
                case 1: // Ganho atual
                    double ganhoAtual = f[i].calculaGanhoAnual();
                    JOptionPane.showMessageDialog(null, "Ganho anual: R$" + ganhoAtual);
                    break;
                case 2: // Finalizar
                    JOptionPane.showMessageDialog(null, "Obrigado por utilizar o sistema!");
                    System.exit(0);
                    break;
                default: // Opção inválida
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}
