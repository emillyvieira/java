/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05ex02;

/**
 *
 * @author emilly
 */
public class ProdutoFabricado implements IProdutoFabricado {
    private String nome;
    private int numeroIngredientes;
    private IProduto[] ingredientes;

    public ProdutoFabricado(String nome, IProduto[] ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.numeroIngredientes = ingredientes.length;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public float getCusto() {
        float custoTotal = 0;
        for (IProduto ingrediente : ingredientes) {
            custoTotal += ingrediente.getCusto();
        }
        return custoTotal;
    }

    @Override
    public int getNumeroIngredientes() {
        return numeroIngredientes;
    }

    @Override
    public IProduto getIngrediente(int numero) {
        if (numero >= 0 && numero < numeroIngredientes) {
            return ingredientes[numero];
        } else {
            return null;
        }
    }

    // Método para reduzir o custo do produto comprado
    public static IProduto reduzirCusto(IProduto produtoComprado) {
        if (produtoComprado instanceof ProdutoFabricado) {
            return produtoComprado; // Se já for fabricado, não é necessário modificar
        }

        // Verifica se é possível fabricar o produto
        String nomeProduto = produtoComprado.getNome();
        String[] ingredientes = GerenteProdutos.Ingredientes(nomeProduto);
        if (ingredientes == null) {
            return produtoComprado; // Não é possível fabricar o produto
        }

        // Calcula o custo fabricado
        float custoFabricado = 0;
        for (String ingrediente : ingredientes) {
            float custoIngrediente = GerenteProdutos.valorCompra(ingrediente);
            if (custoIngrediente <= 0) {
                return produtoComprado; // O ingrediente não tem custo ou é inválido
            }
            custoFabricado += custoIngrediente;
        }

        // Se o custo fabricado for menor que o custo do produto comprado, converte em fabricado
        if (custoFabricado < produtoComprado.getCusto()) {
            IProduto[] produtosIngredientes = new IProduto[ingredientes.length];
            for (int i = 0; i < ingredientes.length; i++) {
                produtosIngredientes[i] = new ProdutoComprado(ingredientes[i], GerenteProdutos.valorCompra(ingredientes[i]));
            }
            return new ProdutoFabricado(nomeProduto, produtosIngredientes);
        } else {
            return produtoComprado; // O custo fabricado não é menor que o custo comprado
        }
    }
}
