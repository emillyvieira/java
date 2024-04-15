/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07p2;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3028569
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nomeArquivo = JOptionPane.showInputDialog("Entre com o nome do arquivo ou diretório: ");
        String texto;

        Item item[] = new Item[5];
        item[0] = new Item("Camiseta Java", 12, 19.99);
        item[1] = new Item("Caneca Java", 8, 9.99);
        item[2] = new Item("Boneco Java", 13, 15.99);
        item[3] = new Item("Broche Java", 29, 3.99);
        item[4] = new Item("Chaveiro Java", 50, 4.99);

        texto = "";
        for (Item i : item) {
            texto += i.toString() + "\n";
        }

        ESArquivo.escreverPrintWriter(texto, nomeArquivo);
        
    }

}
