/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class KonversiNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai akhir WEB: ");
        int nilai = input.nextInt();
        if (nilai >= 90){
            System.out.println("Nilai A");}
        else if (nilai >= 75){
            System.out.println("Nilai B");}
        else if (nilai >= 50){
            System.out.println("Nilai C");}
        else if (nilai >= 35){
            System.out.println("Nilai D");}
        else {
            System.out.println("Nilai E");}
    }
    
}
