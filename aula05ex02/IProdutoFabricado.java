/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aula05ex02;

/**
 *
 * @author emilly
 */
public interface IProdutoFabricado extends IProduto {
    int getNumeroIngredientes();
    IProduto getIngrediente(int numero);
}
