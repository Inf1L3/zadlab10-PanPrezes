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
public class WprowadzZKonsoli {
    public static void WprowadzInt(){
     Scanner s = new Scanner(System.in);
      try{
          int a=s.nextInt();
      }catch(Exception e){
          System.err.println("Nie jest to liczba (int)");
      }
    }
   public static void WprowadzLong(){
      Scanner s = new Scanner(System.in);
      try{
          Long a=s.nextLong();
      }catch(Exception e){
          System.err.println("Nie jest to liczba (Long)");
      }
    }
    public static void WprowadzDouble(){
        Scanner s = new Scanner(System.in);
          try{
          Double a=s.nextDouble();
          }
          catch(Exception e){
          System.err.println("Nie jest to liczba (Double)");
          }
    }
     public static void WprowadzString(){
        Scanner s = new Scanner(System.in);
          try{
          String a=s.nextLine();
          }
          catch(Exception e){
          System.err.println("Nie jest to tekst (String)");
          }
    }
}
