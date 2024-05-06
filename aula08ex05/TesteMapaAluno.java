/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08ex05;

import aula08ex03.Aluno;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author emilly
 */
public class TesteMapaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Integer, Aluno> mapaAlunos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Adicionando 5 alunos ao mapa
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os dados do aluno " + (i + 1) + ":");
            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Curso: ");
            String curso = scanner.nextLine();
            
            Aluno aluno = new Aluno(matricula, nome, curso);
            mapaAlunos.put(matricula, aluno);
        }

        // Busca de aluno por matrícula
        System.out.print("\nDigite a matrícula para buscar o aluno: ");
        int matriculaBusca = scanner.nextInt();
        
        Aluno alunoBusca = mapaAlunos.get(matriculaBusca);
        if (alunoBusca != null) {
            System.out.println("\nAluno encontrado:");
            System.out.println("Matrícula: " + alunoBusca.getMatricula() + ", Nome: " + alunoBusca.getNome() + ", Curso: " + alunoBusca.getCurso());
        } else {
            System.out.println("\nAluno não encontrado!");
        }

    }
    
}
