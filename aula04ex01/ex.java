/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3028569
 */
public class ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Assistente assistente = new Assistente("João", 2500.0, 12345);

        Tecnico tecnico = new Tecnico("Maria", 2000.0, 54321, 100.0);

        JOptionPane.showMessageDialog(null, "Nome: " + assistente.getNome() + "\nNúmero de matrícula: " + assistente.getNumeroMatricula());
        JOptionPane.showMessageDialog(null, "Nome: " + tecnico.getNome() + "\nNúmero de matrícula: " + tecnico.getNumeroMatricula());
    }
}
