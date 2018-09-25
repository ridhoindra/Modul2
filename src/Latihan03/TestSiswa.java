/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan03;

/**
 *
 * @author Indrachelsea
 */

public class TestSiswa {
    
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EcapSiswa siswa = new EcapSiswa();
        siswa.setNama("Ridho Indra");
        siswa.setAbsen(35);
        siswa.setAlamat("Malang");

        System.out.println("Nama   : " + siswa.getNama());
        System.out.println("Absen  : " + siswa.getAbsen());
        System.out.println("Alamat : " + siswa.getAlamat());
    }
}
