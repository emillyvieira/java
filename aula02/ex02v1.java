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
public class ex02v1 {

    public static void main(String[] args) {
        // Solicita a data ao usuário
        String inputData = JOptionPane.showInputDialog("Digite a data (no formato dd/mm/aaaa):");

        // Divide a entrada em dia, mês e ano
        String[] partesData = inputData.split("/");
        int dia = Integer.parseInt(partesData[0]);
        int mes = Integer.parseInt(partesData[1]);
        int ano = Integer.parseInt(partesData[2]);

        // Exibe o resultado para o usuário
        int resultadoValidacao = validarData(dia, mes, ano);
        if (resultadoValidacao == 1) {
            JOptionPane.showMessageDialog(null, "A data é válida.");
        } else {
            JOptionPane.showMessageDialog(null, "A data é inválida.");
        }
    }

    static int validarData(int dia, int mes, int ano) {
        // Verifica se o ano é bissexto
        int[] diasNoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
            diasNoMes[1] = 29;
        }

        // Verifica se o mês é válido
        if (mes < 1 || mes > 12) {
            return 0;
        }

        // Verifica se o dia é válido para o mês
        return (dia >= 1 && dia <= diasNoMes[mes - 1]) ? 1 : 0;
    }
}
