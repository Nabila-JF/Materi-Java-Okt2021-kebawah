/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;

/**
 *
 * @author LENOVO
 */
public class LPBalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int p = 5;
        int l = 10;
        int t = 5;
        System.out.println("Nilai Panjang Balok: "+p);
        System.out.println("Nilai Lebar Balok: "+l);
        System.out.println("Nilai Tinggi Balok: "+t);
        System.out.println("===============================");
        System.out.println("Menghitung Luas Permukaan Balok");
        System.out.println("===============================");
        System.out.println("Luas Permukaan Balok = "+((2*p*l)+(2*p*t)+(2*l*t)));
    }
    
}
