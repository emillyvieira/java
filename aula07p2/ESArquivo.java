/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07p2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author cg3028569
 */
public class ESArquivo {

    public static void escreverPrintWriter(String texto, String nomeArquivo) {

        File f;
        PrintWriter pw = null;
        try {
            f = new File(nomeArquivo + ".txt");
            pw = new PrintWriter(f);
            pw.write(texto);
        } catch (IOException e) {
            System.out.println("Erro durante a escrita no arquivo! \n\n Detalhes do erro: " + e.getMessage());
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    public static void escreverFileWriter(String texto, String nomeArquivo, boolean a) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(nomeArquivo + ".txt", a);
            fw.write(texto);
        } catch (IOException e) {
            System.out.println("Erro durante a escrita no arquivo! \n\n Detalhes do erro: " + e.getMessage());
        }
        if (fw != null) {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println("Erro durante a escrita no arquivo! \n\n Detalhes do erro: " + e.getMessage());
            }
        }
    }

    public static void escreverBufferedWriter(String texto, String nomeArquivo, boolean a) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(nomeArquivo + ".txt", a);
            bw = new BufferedWriter(fw);
        } catch (IOException e) {
            System.out.println("Erro durante a escrita no arquivo! \n\n Detalhes do erro: " + e.getMessage());
        }
        if (bw != null) {
            try {
                bw.write(texto);
                bw.newLine();
            } catch (IOException e) {
                System.out.println("Erro durante a escrita no arquivo! \n\n Detalhes do erro: " + e.getMessage());
            }
            try {
                bw.flush();
                bw.close();
            } catch (IOException e) {
                System.out.println("Erro durante a escrita no arquivo! \n\n Detalhes do erro: " + e.getMessage());
            }
        }
    }

}
