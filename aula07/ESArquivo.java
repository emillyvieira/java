/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

import java.io.File;

/**
 *
 * @author cg3028569
 */
public class ESArquivo {

    public static String isArquivoPasta(String nomeArquivo) {
        String r = "";
        File f = new File(nomeArquivo);
        r += f.getPath() + "\n";
        if (f.isDirectory()) {
            r += "É uma pasta! \n";
            String dir[] = f.list();
            for (String i : dir) {
                r += i + "\n";
            }
        } else {
            r += "É um arquivo!\n";
            r += "Tamanho: " + f.length() + "\n";
        }
        return r;
    }
}
