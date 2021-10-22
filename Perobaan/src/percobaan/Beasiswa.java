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
public class Beasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai TPA: ");
        int TPA = input.nextInt();
        System.out.println("Masukkan nilai Bahasa Inggris: ");
        int BahasaInggris = input.nextInt();
        if ((TPA > 85) && (BahasaInggris > 80)){
            System.out.println("Siswa mendapat beasiswa");}
        else {
            System.out.println("Siswa tidak dapat beasiswa");}
    }
    
}
