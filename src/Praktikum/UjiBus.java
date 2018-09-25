/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Indrachelsea
 */
public class UjiBus {
    public static void main (String[] args){
        int password;
        
        Bus a = new Bus(40);
        a.cetak();
        
        a.getPenumpang(5);
        a.cetak();
        
        a.getPenumpang(35);
        a.cetak();
        
        a.getPenumpang(35);
        a.cetak();
        
        System.out.println("Rata Rata Penumpang "+a.getAverage());
    }
}
