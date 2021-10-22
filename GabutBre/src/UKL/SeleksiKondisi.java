/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKL;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class SeleksiKondisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ID[] = {1,2,3,4};
        String nama[] = {"Galuh", "Indro", "Jedi", "Kanu"};
        int gol[] = {1,3,2,3};
        String alamat[] = {"Sawojajar", "Kedung Kandang", "Ijen", "Dinoyo"};
        int admin = 13000;
        int Tarifgol = 0;
        int JumlahTagihan = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan ID Pelanggan: ");
        int InID = scan.nextInt();
        System.out.print("Masukkan Banyaknya Pemakaian Listrik Dalam kwh: ");
        int pemakaian = scan.nextInt();
        
        switch (gol[InID-1]){
            case 1:
                Tarifgol = 1000;
                break;
            case 2:
                Tarifgol = 1300;
                break;
            case 3:
                Tarifgol = 1500;
                break;
        }
        
        JumlahTagihan = (pemakaian * Tarifgol)+admin;
        if (JumlahTagihan < 50000){
            JumlahTagihan = 50000 + admin;
        }
        //JumlahTagihan = (pemakaian * Tarifgol)+admin;
        
        System.out.println("ID Pelanggan \t: "+ID[InID-1]);
        System.out.println("Nama Pelanggan \t: "+nama[InID-1]);
        System.out.println("Alamat \t\t: "+alamat[InID-1]);
        System.out.println("Tarif Golongan \t: "+Tarifgol);
        System.out.println("Jumlah Tagihan \t: "+JumlahTagihan);
        
    }
    
}
