/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe1poo;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3028569
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto p[] = new Produto[3];

        for (int i = 0; i < p.length; i++) {
            p[i] = new Produto();
        }

        p[0].nome = JOptionPane.showInputDialog("Informe o nome do produto: ");
        p[0].precoCusto = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço do produto: "));
        p[0].precoVenda = p[0].CalculoPrecoVenda(p[0].precoCusto, 1.3f);

        JOptionPane.showMessageDialog(null, "O preço de venda do produto " + p[0].nome + " é: R$" + p[0].precoVenda);
        
        p[1] = new Produto(p[0].nome, p[0].precoCusto);
        JOptionPane.showMessageDialog(null, p[1].nome + ": R$ " + p[1].precoVenda);
    }

}
