/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author emilly
 */
public class ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Agenda agenda = new Agenda();

        // Loop para adicionar contatos
        int opcao = 0;
        while (opcao != 4) {
            // Exibe o menu
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Escolha uma opção:\n"
                    + "1 - Adicionar contato\n"
                    + "2 - Remover contato\n"
                    + "3 - Pesquisar contato\n"
                    + "4 - Sair"));

            switch (opcao) {
                case 1:
                    // Adiciona um novo contato
                    int tipoContato = JOptionPane.showOptionDialog(null,
                            "Selecione o tipo de contato:",
                            "Adicionar Contato",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            new String[]{"Pessoa Física", "Pessoa Jurídica"},
                            null);

                    if (tipoContato == JOptionPane.OK_OPTION) {
                        String nome = JOptionPane.showInputDialog("Digite o nome:");
                        String endereco = JOptionPane.showInputDialog("Digite o endereço:");
                        String email = JOptionPane.showInputDialog("Digite o email:");

                        if (tipoContato == 0) {
                            String cpf = JOptionPane.showInputDialog("Digite o CPF:");
                            String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento:");
                            String estadoCivil = JOptionPane.showInputDialog("Digite o estado civil:");

                            PessoaFisica pf = new PessoaFisica(nome, endereco, email, cpf, dataNascimento, estadoCivil);
                            agenda.adicionarContato(pf);
                        } else {
                            String cnpj = JOptionPane.showInputDialog("Digite o CNPJ:");
                            String inscricaoEstadual = JOptionPane.showInputDialog("Digite a inscrição estadual:");
                            String razaoSocial = JOptionPane.showInputDialog("Digite a razão social:");

                            PessoaJuridica pj = new PessoaJuridica(nome, endereco, email, cnpj, inscricaoEstadual, razaoSocial);
                            agenda.adicionarContato(pj);
                        }
                    }
                    break;
                case 2:
                    // Remove um contato
                    String cpfCnpj = JOptionPane.showInputDialog(null, "Digite o CPF/CNPJ:");
                    agenda.removerContato(cpfCnpj);
                    break;
                case 3:
                    // Pesquisa um contato
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome:");
                    Pessoa contato = agenda.pesquisarContato(nome);
                    if (contato != null) {
                        JOptionPane.showMessageDialog(null, contato.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "Contato não encontrado!");
                    }
                    break;
                case 4:
                    // Sai do programa
                    break;
                default:
                    // Opção inválida
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }

        // Ordena os contatos
        agenda.ordenar();

        // Lista todos os contatos
        agenda.listarContatos();
    }

}
