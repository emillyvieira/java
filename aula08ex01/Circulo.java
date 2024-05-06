/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08ex01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emilly
 */
public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
     public static void main(String[] args) {
        List<Circulo> listaDeCirculos = new ArrayList<>();

        // Criando 5 objetos Circulo de tamanhos diferentes
        listaDeCirculos.add(new Circulo(3.5));
        listaDeCirculos.add(new Circulo(7.2));
        listaDeCirculos.add(new Circulo(1.0));
        listaDeCirculos.add(new Circulo(5.9));
        listaDeCirculos.add(new Circulo(2.3));

        // Percorrendo a lista e imprimindo a área de cada círculo armazenado
        for (Circulo circulo : listaDeCirculos) {
            System.out.println("Área do círculo: " + circulo.calcularArea());
        }
    }

}
