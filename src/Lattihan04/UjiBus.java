/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lattihan04;

/**
 *
 * @author Indrachelsea
 */

public class UjiBus {

    public UjiBus(int par) {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    Bus a  = new Bus(5);
    a.getPenumpang(17);
    a.getPenumpang(24);
    a.cetakPenumpang();
    
    a.addPenumpang(2);
    a.cetakPenumpang();
    
    a.addPenumpang(2);
    a.cetakPenumpang();
    
    a.addPenumpang(2);
    a.cetakPenumpang();
    
    a.addPenumpang(2);
    a.cetakPenumpang();
    }

    

    

    
}
