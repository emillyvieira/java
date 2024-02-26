/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula01;

import java.util.Scanner;

/**
 *
 * @author cg3028569
 */
public class ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float idade, anos, meses, dias;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite sua idade em...");
        System.out.println("ANO(S): ");
        anos = sc.nextInt();
        System.out.print("MES(ES): ");
        meses = sc.nextInt();
        System.out.print("DIA(S): ");
        dias = sc.nextInt();
        
        idade = (anos * 365) + (meses * 30) + (dias);
        
        System.out.println("Idade em dias: " + idade);

    }
    
}
