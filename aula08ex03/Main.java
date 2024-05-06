/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08ex03;

import java.util.Scanner;

/**
 *
 * @author emilly
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CadastroAluno cadastro = new CadastroAluno();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite os dados do aluno " + (i + 1) + ":");
            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Curso: ");
            String curso = scanner.nextLine();

            Aluno aluno = new Aluno(matricula, nome, curso);
            cadastro.adicionarAluno(aluno);
        }

        cadastro.ordenarPorMatricula();
        cadastro.imprimirLista();

    }

}
