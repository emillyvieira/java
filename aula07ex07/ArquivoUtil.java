/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07ex07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author emilly
 */
public class ArquivoUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do arquivo de origem:");
        String arquivoOrigem = scanner.nextLine();

        System.out.println("Informe o nome do arquivo de destino:");
        String arquivoDestino = scanner.nextLine();

        try {
            copiarArquivo(arquivoOrigem, arquivoDestino);
            System.out.println("Arquivo copiado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao copiar arquivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void copiarArquivo(String origem, String destino) throws IOException {
        File arquivoOrigem = new File(origem);
        File arquivoDestino = new File(destino);

        if (!arquivoOrigem.exists()) {
            System.out.println("O arquivo de origem não existe.");
            return;
        }

        if (!arquivoDestino.exists()) {
            File parentDir = arquivoDestino.getParentFile();
            if (!parentDir.exists()) {
                System.out.println("A pasta destino não existe.");
                return;
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("O arquivo de destino já existe. Deseja sobrescrevê-lo? (sim/não)");
            String resposta = scanner.nextLine().toLowerCase();
            scanner.close();
            if (!resposta.equals("sim")) {
                System.out.println("Informe um novo nome para o arquivo de destino:");
                Scanner novoNomeScanner = new Scanner(System.in);
                String novoNome = novoNomeScanner.nextLine();
                novoNomeScanner.close();
                copiarArquivo(origem, novoNome);
                return;
            }
        }

        FileInputStream entrada = null;
        FileOutputStream saida = null;

        try {
            entrada = new FileInputStream(arquivoOrigem);
            saida = new FileOutputStream(arquivoDestino);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = entrada.read(buffer)) > 0) {
                saida.write(buffer, 0, length);
            }
        } finally {
            if (entrada != null) {
                entrada.close();
            }
            if (saida != null) {
                saida.close();
            }
        }

    }

}
