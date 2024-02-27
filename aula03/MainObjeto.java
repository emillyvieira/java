/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3028569
 */
public class MainObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        p1.nome = "elon musk";
        p1.idade = 52;
        p1.nacionalidade = "africa do sul";
        p1.profissao = "empresario";

        Pessoa p2 = new Pessoa();
        p2.nome = "jeff bezos";
        p2.idade = 60;
        p2.nacionalidade = "eua";
        p2.profissao = "empresario";

        JOptionPane.showMessageDialog(null, "Nome: " + p1.nome + "\nIdade: " + p1.idade + "\nNacionalidade: " + p1.nacionalidade + "\nProfissao: " + p1.profissao);
        JOptionPane.showMessageDialog(null, "Nome: " + p2.nome + "\nIdade: " + p2.idade + "\nNacionalidade: " + p2.nacionalidade + "\nProfissao: " + p2.profissao);
    }

}
