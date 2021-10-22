/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatoraritmatika;

/**
 *
 * @author LENOVO
 */
public class OperatorAritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mawar, melati, matahari;
        double harga, total, bayar;
        boolean banding1, banding2;
        
        mawar = 21;
        melati = 2;
        matahari = 5;
        
        harga = 4500.5;
        
        melati += 1; //melati = melati + 1
        
        total = mawar+melati;
        bayar = harga*total;
        
        banding1 = mawar > melati; //jumlah mawar lebih besar daripada melati
        banding2 = melati < matahari; //jumlah melati lebih kecil dari matahari
        
        System.out.println("Jumlah yang dibeli = "+ mawar+"+"+melati+"="+total);
        // System.out.println (mawar+"+"+melati+"="+total);
        System.out.println("Total yang dibayar = Rp"+bayar);
        System.out.println("Mawar > Melati "+banding1);
        System.out.println("Melati < Matahari "+banding2);
        System.out.println("Pembelian bunga mawar lebih banyak daripada bunga melati "+banding1);
        System.out.println("Pembelian bunga melati lebih sedikit daripada bunga matahari "+banding2);
        
        
     

    }
    
}
