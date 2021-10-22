/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanSeleksiKondisi;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Soal1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int id[] = {1, 2, 3, 4};
        String nama[]= {"Galuh", "Indro", "Jedi", "Kanu"};
        int golongan[] = {1, 3, 2, 3};
        String alamat[] = {"Sawojajar", "Kedung Kandang", "Ijen", "Dinoyo"};
        int admin = 13000;
        int TarifGol = 0;
        int JumlahTagihan;
        
        System.out.println("Masukkan ID Pelanggan \t: ");
        int inputID = scan.nextInt();
        
        System.out.println("Masukkan pemakaian listrik \t: ");
        int inputPL = scan.nextInt();
        
        switch (golongan[inputID - 1]){
            case 1:
                TarifGol = 1000;
                break;
            case 2:
                TarifGol = 1300;
                break;
            case 3:
                TarifGol = 1500;
                break;
        }
        
        JumlahTagihan = (inputPL * TarifGol) + admin;
        if(JumlahTagihan < 50000){
        JumlahTagihan = 50000;
        }
        
        System.out.println("ID Pelanggan \t= "+inputID);
        System.out.println("Nama Pelanggan \t= "+nama[inputID - 1]);
        System.out.println("Alamat \t= "+alamat[inputID - 1]);
        System.out.println("Tarif Golongan \t= "+TarifGol);
        System.out.println("Jumlah Tagihan \t= "+JumlahTagihan);
    }
    
}
