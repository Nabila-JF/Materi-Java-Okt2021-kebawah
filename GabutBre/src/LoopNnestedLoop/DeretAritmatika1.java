/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopNnestedLoop;

/**
 *
 * @author LENOVO
 */
public class DeretAritmatika1 {
    
    public static void main(String[] args) {
        //membuat variabel
        int a=5;
        int c=20;
        int b=3;
        int n=10;
        //u = suku
        int suku=a;
        //s = jumlah total suku
        int jumlahTotalSuku=a;
        //membuat proses pengerjaan aritmatika
        System.out.println("Deret Aritmatika adalah ");
        // i = 0 jika di tampilkan pada output maka dibaca 1
        //i++ = i = i+ 1
        //i-- = i = i- 1
        for (int i = 1; i < n; i++) {
            //System.out.println("Suku ke:" +i+ " adalah " +suku);
            suku=suku+b;
            // u = 5 + 3
            jumlahTotalSuku=jumlahTotalSuku+suku;
            //totalnya
            // s = 5 + 8 ...
            if(i > 4 ){
            System.out.println(suku);
            
            }
        }
        jumlahTotalSuku=jumlahTotalSuku-suku;
        System.out.println("Jumlah Deret Aritmatikanya adalah "+jumlahTotalSuku);
        
        
    }
    
}
