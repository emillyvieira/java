/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05ex04;

/**
 *
 * @author emilly
 */
// Classe abstrata Produto que implementa a interface Comparable
abstract class Produto implements Comparable<Produto> {
    protected String nome;
    protected double preco;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método abstrato para calcular o custo-benefício
    abstract double calcularCustoBeneficio();

    // Método compareTo para comparar produtos pelo custo-benefício
    @Override
    public int compareTo(Produto outro) {
        double meuCustoBeneficio = calcularCustoBeneficio();
        double custoBeneficioOutro = outro.calcularCustoBeneficio();
        return Double.compare(meuCustoBeneficio, custoBeneficioOutro);
    }
}

// Classe Shampoo, filha de Produto
class Shampoo extends Produto {
    private int irritabilidade;

    // Construtor
    public Shampoo(String nome, double preco, int irritabilidade) {
        super(nome, preco);
        this.irritabilidade = irritabilidade;
    }

    // Método para calcular o custo-benefício do shampoo
    @Override
    double calcularCustoBeneficio() {
        return preco / irritabilidade; // Fórmula simples para exemplo
    }
}

// Classe Biscoito, filha de Produto
class Biscoito extends Produto {
    private int componentesCancerigenos;

    // Construtor
    public Biscoito(String nome, double preco, int componentesCancerigenos) {
        super(nome, preco);
        this.componentesCancerigenos = componentesCancerigenos;
    }

    // Método para calcular o custo-benefício do biscoito
    @Override
    double calcularCustoBeneficio() {
        return preco / componentesCancerigenos; // Fórmula simples para exemplo
    }
}

// Classe Leite, filha de Produto
class Leite extends Produto {
    private int diasDuracao;

    // Construtor
    public Leite(String nome, double preco, int diasDuracao) {
        super(nome, preco);
        this.diasDuracao = diasDuracao;
    }

    // Método para calcular o custo-benefício do leite
    @Override
    double calcularCustoBeneficio() {
        return preco / diasDuracao; // Fórmula simples para exemplo
    }
}

