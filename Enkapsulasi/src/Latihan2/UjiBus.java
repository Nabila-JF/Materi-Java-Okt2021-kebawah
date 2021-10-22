/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author LENOVO
 */
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //membuat objek busBesar dari class Bus
        Bus busBesar = new Bus (40);
        busBesar.cetak();
        
        //penambahn penumpang
        busBesar.addPenumpang(15);//menambahkan 15 penumpang
        busBesar.cetak();
        
        //penambahn penumpang
        busBesar.addPenumpang(5);//menambahkan 5 penumpang
        busBesar.cetak();
        
        //penambahn penumpang
        busBesar.addPenumpang(26);//menambahkan 26 penumpang
        busBesar.cetak();
        
    }
    
}
