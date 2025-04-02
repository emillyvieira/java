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
    float PrecoCusto;
    float PrecoVenda;
    
    float CalculoPrecoVenda(float valor, float lucro) {
        return valor*lucro;
    }
}
