/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasProduktif1;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        double a = 10.5, b = 4.5;
        
        OperasiBilanganAbs penjumlahan = new OperasiPenjumlahan();
        OperasiBilanganAbs pengurangan = new OperasiPengurangan();
        OperasiBilanganAbs perkalian = new OperasiPerkalian();
        OperasiBilanganAbs pembagian = new OperasiPembagian();
        
        OperasiBilanganAbs[] objek = {penjumlahan, pengurangan, perkalian, pembagian };
        
        OperasiBilanganAbsCetak pencetak = new OperasiBilanganAbsCetak();
        pencetak.cetakSemua(objek, a, b);
    }
}
