/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08ex04;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author emilly
 */
public class ConjuntoDePalavras {
    private Set<String> conjunto;

    public ConjuntoDePalavras(String... palavras) {
        conjunto = new HashSet<>();
        for (String palavra : palavras) {
            conjunto.add(palavra);
        }
    }

    public boolean contemTodas(String palavras) {
        String[] palavrasSeparadas = palavras.split("\\s+");
        for (String palavra : palavrasSeparadas) {
            if (!conjunto.contains(palavra)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ConjuntoDePalavras conjunto = new ConjuntoDePalavras("ola", "mundo", "java");

        // Exemplo de uso
        String entrada = "java mundo";
        if (conjunto.contemTodas(entrada)) {
            System.out.println("Todas as palavras estão presentes no conjunto.");
        } else {
            System.out.println("Algumas palavras não estão presentes no conjunto.");
        }
    }

}
