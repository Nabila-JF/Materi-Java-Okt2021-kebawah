/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Remidi;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class HasilAkhir {
    
    static Olahraga SepatuOR = new Olahraga("Adidas", "Perempuan", "Black", 30, 500000);
    static Kantoran SepatuKTR = new Kantoran("Fila", "Perempuan", "Black", 30, 700000);
    static Santai SepatuSNT = new Santai("Skechers", "Perempuan", "White", 30, 900000);
        
    public static void main(String[] args) {
        
        String KB;
        int jumlahpembelian, norpil;
        double diskon, totalharga;
        double harga = 0;
        
        
        System.out.println("Daftar Beli Toko Jayabaru");
        System.out.println("==========");
        System.out.println("Nama Kasir: Nabila");
        System.out.println("Tanggal Pembelian: 28 Mei 2021");
        System.out.println("==========");
        
        System.out.println("Berikut Merupakan Daftar Sepatu Yang Bisa Dibeli: ");
        System.out.println("\n1. Sepatu Pertama:");
        SepatuOR.showOlahraga();
        System.out.println("\n2. Sepatu Kedua:");
        SepatuKTR.showKantoran();
        System.out.println("\n3. Sepatu Ketiga:");
        SepatuSNT.showSantai();
        System.out.println("==========");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silahkan Input Nomor Pilihan Anda: ");
        norpil = scanner.nextInt();
        
        switch(norpil){
            case 1: 
                harga = SepatuOR.getHarga(); 
                break;
            case 2: 
                harga = SepatuKTR.getHarga(); 
                break;
            case 3: 
                harga = SepatuSNT.getHarga(); 
                break;
        }      
        
        System.out.println("==========");
        System.out.println("Informasi: Anda hanya dapat membeli sepatu sebanyak 1-3 buah.");
        System.out.print("Silahkan Input Jumlah Barang Yang Dibeli: ");
        jumlahpembelian = scanner.nextInt();
        System.out.println("==========");
        
        totalharga = harga*jumlahpembelian - HitungDiskon.potonganharga(jumlahpembelian);
        
        System.out.println("Berikut Merupakan Total Harga Beli Anda: "+totalharga);
        
        

        
    }
}
