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
public class Kondisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int nilai;
        System.out.println("Masukkan nilai akhir PBO: ");
        nilai = input.nextInt();
        if (nilai < 70){
        System.out.println("Siswa tidak lulus");}
        if (nilai > 70){
        System.out.println("Siswa lulus");}
    }
    
}
