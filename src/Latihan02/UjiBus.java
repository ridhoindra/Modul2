/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan02;

/**
 *
 * @author Indrachelsea
 */

public class UjiBus {
    
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bus a = new Bus(40);
        a.cetak();

        a.addPenumpang(15);
        a.cetak();

        a.addPenumpang(5);
        a.cetak();

        a.addPenumpang(26);
        a.cetak();
    }
}
