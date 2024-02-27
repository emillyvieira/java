/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03ex;

/**
 *
 * @author cg3028569
 */
public class Aluno {

    public Aluno() {
    }
    String matricula;
    String nome;
    float p1, p2, t1;
    float peso1 = (float) 2.5;
    float peso2 = (float) 2.0;
    float nf;

    public float getNf() {
        return nf;
    }

    public void setNf(float nf) {
        this.nf = nf;
    }

    float CalculoMedia(float p1, float p2, float p3) {
        return (p1 * peso1 + p2 * peso1 + t1 * peso2) / 10;
    }

    float Rec(float nf) {
        if (nf < 6) {
            float x, y;
            y = 6 - nf;
            x = (nf + y);
            return x;
        }
        return 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public float getT1() {
        return t1;
    }

    public void setT1(float t1) {
        this.t1 = t1;
    }

    public float getPeso1() {
        return peso1;
    }

    public void setPeso1(float peso1) {
        this.peso1 = peso1;
    }

    public float getPeso2() {
        return peso2;
    }

    public void setPeso2(float peso2) {
        this.peso2 = peso2;
    }

}
