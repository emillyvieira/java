/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04;

/**
 *
 * @author cg3028569
 */
public class heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Funcionario f = new Funcionario("Joao");
        f.setSalario(1000);

        Gerente g = new Gerente("Maria", "airam", "123");
        g.setSalario(1000);

        Funcionario fg = new Gerente("Jose", "esoj", "321");
        fg.setSalario(1000);

        System.out.println("Funcionario: " + f.getNome() + " Bonificacao: " + f.calculaBonificacao());
        System.out.println("Funcionario: " + g.getNome() + " Bonificacao: " + g.calculaBonificacao());
        System.out.println("Funcionario: " + fg.getNome() + " Bonificacao: " + fg.calculaBonificacao());

    }

}
