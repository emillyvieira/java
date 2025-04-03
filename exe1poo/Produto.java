/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe1poo;

/**
 *
 * @author cg3028569
 */
public class Produto {
    String nome;
    float precoCusto;
    float precoVenda;
    
    Produto() {
        System.out.println("Construindo um produto...");
    }
    
    Produto(String nome, float precoCusto) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = CalculoPrecoVenda(precoCusto, 1.3f);
    }
    
    float CalculoPrecoVenda(float valor, float lucro) {
        return valor*lucro;
    }
}
