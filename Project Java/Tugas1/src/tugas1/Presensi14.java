/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Presensi14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Biodata Anda\n");
        Scanner input=new Scanner (System.in);
        
        String namalengkap, namaakrab, ttl, askot, asSMP, hobi, kalmov, prestasi;
        
        System.out.println("Masukkan nama lengkap anda: ");
        namalengkap=input.nextLine();
        
        System.out.println("Masukkan nama akrab anda: ");
        namaakrab=input.nextLine();
        
        System.out.println("Masukkan tempat-tanggal lahir anda: ");
        ttl=input.nextLine();
        
        System.out.println("Masukkan asal kota anda: ");
        askot=input.nextLine();
        
        System.out.println("Masukkan asal SMP anda: ");
        asSMP=input.nextLine();
        
        System.out.println("Masukkan hobi anda: ");
        hobi=input.nextLine();
        
        System.out.println("Masukkan kalimat motivasi anda: ");
        kalmov=input.nextLine();
        
        System.out.println("Masukkan prestasi anda: ");
        prestasi=input.nextLine();
        
        System.out.println("\nBerikut merupakan hasil pengisian biodata anda: \n");
        System.out.println("Nama Lengkap: "+namalengkap+"\nNama Akrab: "+namaakrab+"\nTempat/Tanggal Lahir: "+ttl+"\nAsal Kota: "+askot+"\nAsal SMP: "+asSMP+"\nHobi: "+hobi+"\nKalimat Motivasi: "+kalmov+"\nPrestasi: "+prestasi);
    }
    
}
