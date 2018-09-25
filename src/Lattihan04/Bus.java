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

public class Bus {
    
/**
     * @param args the command line arguments
     */
    public int penumpang;
    public int maxPenumpang;

    public Bus(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    public void addPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }

    public void getPenumpang(int pass) {
        if (pass==35){
            System.out.println("Password Benar");
        }else{
            System.out.println("Password Salah");}
    }
    
    public void cetakPenumpang(){
        System.out.println("Penumpang Bus Sekarang : "+ penumpang);
        System.out.println("Maksimum Penumpang yang Seharusnya Adalah : "+ maxPenumpang);
    }
    
}
