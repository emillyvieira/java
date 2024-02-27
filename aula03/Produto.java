/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

/**
 *
 * @author cg3028569
 */
public class Produto {

    private String nome;
    private float precoCusto;
    private float precoVenda;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getNome() {
        return nome;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }
      
    Produto(){
        System.out.println("Construindo objeto...");
    }
    
    float CalculoPrecoVenda(float valor, float lucro) {
        return valor*lucro;
    }
}
