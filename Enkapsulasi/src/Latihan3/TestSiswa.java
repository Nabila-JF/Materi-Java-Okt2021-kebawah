/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author LENOVO
 */
public class TestSiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setNama("Julian");
        siswa.setAbsen(23);
        siswa.setAlamat("Malang");
        
        System.out.println("Nama: "+ siswa.getNama() + "\nAbsen: "+ 
                siswa.getAbsen() + "\nAlamat: "+ siswa.getAlamat());
    }
    
}
