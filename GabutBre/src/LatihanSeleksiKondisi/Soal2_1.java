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
public class Soal2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ID[] = {1, 2, 3, 4};
        String nama[] = {"Mira", "Nina", "Oemar", "Pena"};
        String jalur[] = {"SBMPTN", "SNMPTN", "Mandiri", "SBMPTN"};
        String alamat[] = {"Sawojajar", "Kedung Kandang", "Ijen", "Dinoyo"};
        String kategori = null;
        int SPP = 0;
        int DSP;
        int total;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan ID Mahasiswa: ");
        int InputID = scan.nextInt();
        
        System.out.print("Masukkan Pendapatan Ortu: ");
        int PendapatanOrtu = scan.nextInt();
        
        System.out.print("Masukkan Jumlah Bulan Untuk Membayar SPP: ");
        int Bulan = scan.nextInt();
        
        /////////
        
        if(PendapatanOrtu < 2000000){
            kategori = "A";
        }
        else if(PendapatanOrtu >= 2000000 && PendapatanOrtu <= 10000000 ){
            kategori = "B";
        }
        else if(PendapatanOrtu > 10000000){
            kategori = "C";
        }
        
        /////////
        
        if(jalur[InputID - 1]== "SBMPTN"){
            if (kategori == "A"){
            DSP = 5000000;
            SPP = 500000;
            }
            else if (kategori == "B"){
            DSP = 15000000;
            SPP = 1000000;
            }
            else if (kategori == "C"){
            DSP = 30000000;
            SPP = 2000000;
            }
        }
        else if(jalur[InputID - 1]== "SNMPTN"){
            if (kategori == "A"){
            DSP = 7000000;
            SPP = 500000;
            }
            else if (kategori == "B"){
            DSP = 17000000;
            SPP = 1000000;
            }
            else if (kategori == "C"){
            DSP = 35000000;
            SPP = 2000000;
            }
        }
        else if(jalur[InputID - 1]== "Mandiri"){
            if (kategori == "A"){
            DSP = 10000000;
            SPP = 1000000;
            }
            else if (kategori == "B"){
            DSP = 25000000;
            SPP = 2000000;
            }
            else if (kategori == "C"){
            DSP = 50000000;
            SPP = 3000000;
            }
        }
        
        ///////////
        
        total = Bulan * SPP;
        
        ///////////
        System.out.println("===================");
        System.out.println("ID Mahasiswa \t\t\t\t: " + ID[InputID - 1]);
        System.out.println("Nama Mahasiswa \t\t\t\t: " + nama[InputID - 1]);
        System.out.println("Jalur Masuk \t\t\t\t: " + jalur[InputID - 1]);
        System.out.println("Kategori Pendapatan\t\t\t: "+kategori);
        System.out.println("Jumlah Biaya Yang Harus Dibayarkan\t: "+total);
        System.out.println("Alamat Mahasiswa \t\t\t: " + alamat[InputID - 1]);
        
    }
    
}
