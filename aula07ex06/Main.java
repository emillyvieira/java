/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07ex06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author emilly
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("alunos.dat"));

            // Lendo os alunos do arquivo
            Aluno[] alunos = new Aluno[3];
            for (int i = 0; i < alunos.length; i++) {
                int nomeLength = inputStream.readInt();
                StringBuilder nomeBuilder = new StringBuilder();
                for (int j = 0; j < nomeLength; j++) {
                    nomeBuilder.append(inputStream.readChar());
                }
                String nome = nomeBuilder.toString();
                int codigo = i + 1;
                int nota1 = inputStream.readInt();
                int nota2 = inputStream.readInt();
                alunos[i] = new Aluno(nome, codigo, nota1, nota2);
            }

            inputStream.close();

            // Calculando e exibindo informações sobre os alunos
            double somaNotas = 0;
            int aprovados = 0;
            int ifa = 0;
            int reprovados = 0;

            System.out.println("Resultado da turma:");

            for (Aluno aluno : alunos) {
                somaNotas += aluno.calcularMedia();
                if (aluno.foiAprovado()) {
                    System.out.println(aluno.getNome() + " - Aprovado");
                    aprovados++;
                } else if (aluno.foiParaIFA()) {
                    System.out.println(aluno.getNome() + " - IFA");
                    ifa++;
                } else {
                    System.out.println(aluno.getNome() + " - Reprovado");
                    reprovados++;
                }
            }

            double mediaTurma = somaNotas / alunos.length;
            System.out.println("\nMédia da turma: " + mediaTurma);
            System.out.println("Aprovados: " + aprovados);
            System.out.println("IFA: " + ifa);
            System.out.println("Reprovados: " + reprovados);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
