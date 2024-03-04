/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02;

import javax.swing.JOptionPane;

/**
 *
 * @author emilly
 */
public class ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tamanhoV1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do array v1:"));
        int tamanhoV2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do array v2:"));

        int[] v1 = new int[tamanhoV1];
        int[] v2 = new int[tamanhoV2];

        for (int i = 0; i < tamanhoV1; i++) {
            v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento " + (i + 1) + " do array v1:"));
        }

        for (int i = 0; i < tamanhoV2; i++) {
            v2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento " + (i + 1) + " do array v2:"));
        }

        mergeArrays(v1, v2);

        JOptionPane.showMessageDialog(null, "Array v1 após a mesclagem: " + arrayToString(v1));
    }

    public static void mergeArrays(int[] v1, int[] v2) {
        for (int num : v2) {
            if (!contains(v1, num)) {
                int index = 0;
                while (v1[index] != 0) {
                    index++;
                }
                v1[index] = num;
            }
        }
    }

    public static boolean contains(int[] array, int num) {
        for (int element : array) {
            if (element == num) {
                return true;
            }
        }
        return false;
    }

    public static String arrayToString(int[] array) {
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            if (i < array.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}
