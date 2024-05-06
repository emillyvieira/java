/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07ex05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author emilly
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[3];

        // Simulando entrada de dados
        alunos[0] = new Aluno("João", 1, 80, 85);
        alunos[1] = new Aluno("Maria", 2, 75, 90);
        alunos[2] = new Aluno("Pedro", 3, 85, 88);

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("alunos.dat"));

            for (Aluno aluno : alunos) {
                // Escrevendo o tamanho do nome
                outputStream.writeInt(aluno.getNome().length());
                // Escrevendo o nome
                outputStream.writeChars(aluno.getNome());
                // Escrevendo as notas
                outputStream.writeInt(aluno.getNota1());
                outputStream.writeInt(aluno.getNota2());
            }

            outputStream.close();
            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
