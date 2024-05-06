/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author emilly
 */
public class CadastroAluno {
     private List<Aluno> listaAlunos;

    public CadastroAluno() {
        listaAlunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public void ordenarPorMatricula() {
        Collections.sort(listaAlunos, Comparator.comparing(Aluno::getMatricula));
    }

    public void imprimirLista() {
        for (Aluno aluno : listaAlunos) {
            System.out.println("Matrícula: " + aluno.getMatricula() +
                               ", Nome: " + aluno.getNome() +
                               ", Curso: " + aluno.getCurso());
        }
    }
}
