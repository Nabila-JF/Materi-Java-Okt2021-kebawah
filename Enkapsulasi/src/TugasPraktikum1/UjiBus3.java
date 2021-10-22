/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;

/**
 *
 * @author LENOVO
 */
public class UjiBus3 {
    public static void main(String[] abc) {
        Bus3 Bus = new Bus3(20);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(10);//tambah 10 penumpang
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(5);//tambah 5 penumpang
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(3);//tambah 3 penumpang
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(2);//tambah 2 penumpang
        Bus.cetakpenumpang();
        
        System.out.println("Rata-rata berat penumpang sekarang adalah "+Bus.getAverage());
    }
}
