/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Remidi;

/**
 *
 * @author LENOVO
 */
public class Kantoran extends Sepatu {
    
    protected String kategori = "Kantoran";
    
    public Kantoran(String merk, String jenis, String warna, int ukuran, double harga){
        super(merk, jenis, warna, ukuran, harga);
    }
    
    public void showKantoran(){
        System.out.println("Kategori Sepatu: Kantoran");
        System.out.println("Merk Sepatu: " + merk);
        System.out.println("Jenis Sepatu: " + jenis);
        System.out.println("Warna Sepatu: " + warna);
        System.out.println("Ukuran Sepatu: " + ukuran);
        System.out.println("Harga Sepatu: " + harga);
    }
}
