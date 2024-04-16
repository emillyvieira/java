/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07p3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author cg3028569
 */
public class ESArquivo {

    public static String lerFileReader(String nomeArquivo) {
        int c = 0;
        String r = "";
        FileReader fr = null;
        try {
            fr = new FileReader(nomeArquivo + ".txt");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado! \n\n Detalhes do erro: " + e.getMessage());
        }
        if (fr != null) {
            do {
                r += (char) c;
                try {
                    c = fr.read();
                } catch (IOException e) {
                    System.out.println("Erro durante a leitura do arquivo! \n\n Detalhes do erro: " + e.getMessage());
                }
            } while (c != -1);
            try {
                fr.close();
            } catch (IOException e) {
                System.out.println("Erro durante o fechamento do arquivo! \n\n Detalhes do erro: " + e.getMessage());
            }

        }
        return r;
    }

    public static String lerBufferedReader(String nomeArquivo) {
        String r = "";
        String linha = "";
        FileReader fr;
        BufferedReader br = null;
        try {
            fr = new FileReader(nomeArquivo + ".txt");
            br = new BufferedReader(fr);

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado! \n\n Detalhes do erro: " + e.getMessage());
        }
        if (br != null) {
            do {
                r += linha + " \n";
                try {
                    linha = br.readLine();
                } catch (IOException e) {
                    System.out.println("Erro durante a leitura do arquivo! \n\n Detalhes do erro: " + e.getMessage());
                }
            } while (linha != null);
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Erro durante o fechamento do arquivo! \n\n Detalhes do erro: " + e.getMessage());
            }

        }
        return r;
    }
}
