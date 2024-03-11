/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao.classe;

/**
 *
 * @author emilly
 */
public class Aluno {
    String nome;
    String matricula;
    float p1, p2, t1;
    float peso1 = (float) 2.5;
    float peso2 = (float) 2;
    float nf;
    
    public float media(float a, float b, float c) {
        return (a* peso1 +b* peso1 + c*peso2);
    }
    
    public float rec(float a) {
        float n;
        n = 6-a;
        return n;
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

    public String getNome() {
        return nome;
    }

    public float getNf() {
        return nf;
    }

    public void setNf(float nf) {
        this.nf = nf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
    
    
    
}
