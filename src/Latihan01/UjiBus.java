/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan01;

/**
 *
 * @author Indrachelsea
 */

public class UjiBus {
    
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bus a = new Bus();
        a.setPenumpang(5);
        a.setMaxPenumpang(15);
        a.cetak();

        a.setPenumpang(a.penumpang + 5);
        a.cetak();

        a.setPenumpang(a.penumpang - 2);
        a.cetak();

        a.setPenumpang(a.penumpang + 5);
        a.cetak();
    }
}
