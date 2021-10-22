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
public class Soal2 {
    static int bayar(String jalur, String golongan, int jumlahBulan) {
   
    int dsp = 0;
    int spp = 0;
    int total = 0;
    
    if (jalur == "SBMPTN"){
        if (golongan == "A"){
        dsp = 5000000;
        spp = 500000;
        } else if (golongan == "B"){
        dsp = 15000000;
        spp = 1000000;
        }  else if (golongan == "C"){
        dsp = 30000000;
        spp = 2000000;
        }
    } else if (jalur == "SNMPTN"){
        if (golongan == "A"){
            dsp = 7000000;
            spp = 500000;
        } else if (golongan == "B"){
            dsp = 17000000;
            spp = 1000000;
        } else if (golongan == "C"){
            dsp = 35000000;
            spp = 2000000;
        }
    } else if (jalur == "Mandiri"){
        if (golongan == "A"){
            dsp = 10000000;
            spp = 1000000;
        } else if (golongan == "B"){
            dsp = 25000000;
            spp = 2000000;
        } else if (golongan == "C"){
            dsp = 50000000;
            spp = 3000000;
        }
    }
    total = dsp + (jumlahBulan * spp);
    return total;
}
static String Kategori(int pendapatan){
    String kategori = null;
    if (pendapatan <2000000){
        kategori = "A";
    } else if (pendapatan >= 2000000 && pendapatan <=10000000){
        kategori = "B";
    } else if (pendapatan > 10000000){
        kategori = "C";
    }
    return kategori;
}


public static void main(String[] args){
    Scanner a = new  Scanner(System.in);

    int id[] = {1, 2, 3, 4};
    String nama[] = {"Mira", "Nina", "Oemar", "Pena"};
    String jalur[] = {"SBMPTN", "SNMPTN", "Mandiri", "SBMPTN"};
    String alamat[] = {"Sawojajar", "Kedungkandang", "Ijen", "Dinoyo"};
    
    System.out.println("Masukkan ID Mahasiswa : ");
    String idM = a.nextLine();
    int inId = Integer.valueOf(idM);
    
    System.out.println("Masukkan Pendapatan Orang Tua : ");
    String pendapatan = a.nextLine();
    int pendapatannOrtu = Integer.valueOf(pendapatan);
    
    System.out.println("Masukkan Jumlah Bulan : ");
    String jmlBln = a.nextLine();
    int bulan = Integer.valueOf(jmlBln);
    
    System.out.println("Masukkan Jumlah SPP yang akan dibayarkan : ");
    String bayarSpp = a.nextLine();
    int pembayaran = Integer.valueOf(bayarSpp);
    int total = bulan * pembayaran;
    
    System.out.println("ID Mahasiswa \t\t: " + id[inId - 1]);
    System.out.println("Nama Mahasiswa \t\t: " + nama[inId - 1]);
    System.out.println("Jalur Masuk \t\t: " + jalur[inId - 1]);
    System.out.println("Alamat \t\t\t: " + alamat[inId - 1]);
    System.out.println("Jumlah SPP yang akan Dikeluarkan : " + total);
}
    
}
