/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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

    public void salvarAgenda(String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Object contato : contatos) {
                if (contato instanceof PessoaFisica) {
                    PessoaFisica pf = (PessoaFisica) contato;
                    writer.write(pf.getCpf() + "#" + pf.getNome() + "#" + pf.getEndereco() + "#" + pf.getEmail() + "#" + pf.getDataNascimento() + "#" + pf.getEstadoCivil());
                } else if (contato instanceof PessoaJuridica) {
                    PessoaJuridica pj = (PessoaJuridica) contato;
                    writer.write(pj.getCnpj() + "#" + pj.getNome() + "#" + pj.getEndereco() + "#" + pj.getEmail() + "#" + pj.getInscricaoEstadual() + "#" + pj.getRazaoSocial());
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Contato lerContatoPorNome(String nome, String nomeArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split("#");
                if (partes[1].equals(nome)) {
                    if (partes.length == 6) { // Pessoa Física
                        return new PessoaFisica(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5]);
                    } else if (partes.length == 7) { // Pessoa Jurídica
                        return new PessoaJuridica(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5], partes[6]);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null; // Contato não encontrado
    }

}
