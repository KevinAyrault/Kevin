/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monapp;

/**
 *
 * @author Kévin
 */
public class MonApp {
    
  static int i = 0;
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Lapin lapin=new Lapin("Janno",20);
        System.out.println("Hello World");
        while(i <= 100){
        lapin.Crier();
        i++;
    }
    }
    
  
    
}
