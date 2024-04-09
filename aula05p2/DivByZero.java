/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05p2;

/**
 *
 * @author cg3028569
 */
public class DivByZero extends ArithmeticException{

    public DivByZero() {
        super("Tentativa de divisão por zero!");
    }
    
    public DivByZero(String msg) {
        super(msg);
    }
    
    @Override
    public String toString() {
        return "Divisão por zero: ";
    }
}
