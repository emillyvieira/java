/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07ex05;

import java.io.Serializable;

/**
 *
 * @author emilly
 */
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nome;
    private int codigo;
    private int nota1;
    private int nota2;

    public Aluno(String nome, int codigo, int nota1, int nota2) {
        this.nome = nome;
        this.codigo = codigo;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }
}
