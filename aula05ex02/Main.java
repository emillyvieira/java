/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05ex02;

/**
 *
 * @author emilly
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criando produtos comprados
        IProduto produto1 = new ProdutoComprado("Produto1", 10);
        IProduto produto2 = new ProdutoComprado("Produto2", 15);

        // Reduzindo o custo dos produtos comprados
        IProduto produtoReduzido1 = ProdutoFabricado.reduzirCusto(produto1);
        IProduto produtoReduzido2 = ProdutoFabricado.reduzirCusto(produto2);

        // Exibindo os resultados
        System.out.println("Produto1:");
        System.out.println("Nome: " + produtoReduzido1.getNome());
        System.out.println("Custo: " + produtoReduzido1.getCusto());

        System.out.println("\nProduto2:");
        System.out.println("Nome: " + produtoReduzido2.getNome());
        System.out.println("Custo: " + produtoReduzido2.getCusto());
    }

}
