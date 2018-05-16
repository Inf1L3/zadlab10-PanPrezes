/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Scanner;

/**
 *
 * @author Patryk
 */
public class Zad2 {
  public static void main(String[] args) {
      int[] tab = new int[5];
      System.out.println("Podaj ile elementów wprowadzić do tablicy 5 el. ");
      Scanner s = new Scanner(System.in);
     int j=s.nextInt();
        try {
           for (int i = 0; i < j; i++) {
                tab[i] = 0;
            }
            }catch(ArrayIndexOutOfBoundsException e){
                    System.err.println("Przekroczono zakres tabeli");
                    }
        }
  }
    

