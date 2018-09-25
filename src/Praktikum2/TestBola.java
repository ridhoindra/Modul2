/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author Indrachelsea
 */
public class TestBola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double jarijari=14;
      Bola a = new Bola(7);
      a.showDiameter();
      a.showLuas();
      a.showVolume();
        System.out.println("\n\n");
        a.setJarijari(jarijari);
        a.showDiameter();
        a.showLuas();
        a.showVolume();
      
    }
    
}
