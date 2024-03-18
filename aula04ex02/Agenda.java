/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04ex02;

/**
 *
 * @author emilly
 */
public class Agenda {

    private Object[] contatos = new Object[10]; // Array inicial para armazenar contatos
    private int capacidade = 10; // Capacidade inicial do array
    private int tamanho = 0; // Tamanho atual do array (número de contatos)

    public void adicionarContato(PessoaFisica contato) {
        if (tamanho == capacidade) {
            expandirCapacidade(); // Aumenta a capacidade do array se estiver cheio
        }
        contatos[tamanho] = contato;
        tamanho++;
    }

    private void expandirCapacidade() {
        capacidade *= 2; // Duplica a capacidade do array
        Object[] novoArray = new Object[capacidade];
        for (int i = 0; i < tamanho; i++) {
            novoArray[i] = contatos[i];
        }
        contatos = novoArray;
    }

    public void removerContato(String cpfCnpj) {
        for (int i = 0; i < tamanho; i++) {
            if (((Pessoa) contatos[i]).getCpfCnpj().equals(cpfCnpj)) {
                // Desloca os elementos para a esquerda para preencher a lacuna
                for (int j = i; j < tamanho - 1; j++) {
                    contatos[j] = contatos[j + 1];
                }
                tamanho--;
                break;
            }
        }
    }

    public Pessoa pesquisarContato(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (((Pessoa) contatos[i]).getNome().equals(nome)) {
                return (Pessoa) contatos[i];
            }
        }
        return null;
    }

    public void ordenar() {
        // implementação manual de ordenação (por exemplo, bubble sort)
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                String cpfCnpj1 = ((Pessoa) contatos[j]).getCpfCnpj();
                String cpfCnpj2 = ((Pessoa) contatos[j + 1]).getCpfCnpj();
                if (cpfCnpj1.compareTo(cpfCnpj2) > 0) {
                    Object temp = contatos[j];
                    contatos[j] = contatos[j + 1];
                    contatos[j + 1] = temp;
                }
            }
        }
    }

    public void listarContatos() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(contatos[i].toString());
        }
    }

    void adicionarContato(PessoaJuridica pj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
