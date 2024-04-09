/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05p2;

/**
 *
 * @author cg3028569
 */
public class Calc {

    public int div(int a, int b) throws DivByZero {
        if (b == 0) {
            throw new DivByZero();
        }
        return a/b;
    }
}
