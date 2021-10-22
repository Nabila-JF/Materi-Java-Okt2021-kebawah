/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan_enkapsulasi;

/**
 *
 * @author LENOVO
 */
public class Bus {
    int penumpang;
    int maxpenumpang;
    
    public Bus(int maxPenumpang){
    this.maxpenumpang = maxPenumpang;
    penumpang = 0;
    }

    Bus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addPenumpang (int penumpang) {
    int temp;
    temp = this.penumpang+penumpang;
    if (temp >= maxpenumpang){
        System.out.println("Penumpang melebihi kuota");
    }else {
    this.penumpang = temp;
    }
    
    }
    public void cetak(){
        System.out.println("Penumpang bus sekarang adalah "+ penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah "+ maxpenumpang);
    }
    
}
