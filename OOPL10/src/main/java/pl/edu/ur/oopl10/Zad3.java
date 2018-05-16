/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author Patryk
 */
public class Zad3 {
        public static void dzielenie() {
        int x = 20;
        int y = 0;
        try {
            int z = x / y;
        } catch (ArithmeticException e) {
            System.err.println("Dzielenie przez 0");
        }
    }

    
}
