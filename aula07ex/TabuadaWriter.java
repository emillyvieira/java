/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author cg3028569
 */
public class TabuadaWriter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número para ler a tabuada: ");
        int num = scanner.nextInt();

        String nomeArquivo = "tabuada_" + num + ".txt";

        try {
            FileReader arquivoLeitura = new FileReader(nomeArquivo);
            BufferedReader leitor = new BufferedReader(arquivoLeitura);

            String linha;
            System.out.println("Conteúdo da tabuada do " + num + ":");
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }

            leitor.close();
            arquivoLeitura.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            System.out.println("O arquivo de tabuada não existe.");
        }

        scanner.close();
    }
}
