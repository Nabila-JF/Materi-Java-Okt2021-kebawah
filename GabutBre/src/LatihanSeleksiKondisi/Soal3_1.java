/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanSeleksiKondisi;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Soal3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ID[] = {1,2,3};
        String NamaDaerah[] = {"Porong", "Kejapanan", "Gempol"};
        int biaya = 0;
        
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan ID Daerah Masuk: ");
        int masuk = scan.nextInt();
        System.out.print("Masukkan ID Daerah Keluar: ");
        int keluar = scan.nextInt();
        System.out.print("Masukkan Golongan Kendaraan: ");
        int gol = scan.nextInt();
        
        if (NamaDaerah[masuk-1] == "Porong" && NamaDaerah[keluar-1] == "Kejapanan"){
            if (gol == 1){
            biaya = 6000;
            }
            else if (gol == 2){
            biaya = 8500;
            }
            else if (gol == 3){
            biaya = 8500;
            }
        }
        else if (NamaDaerah[masuk-1] == "Kejapanan" && NamaDaerah[keluar-1] == "Gempol"){
            if (gol == 1){
            biaya = 3000;
            }
            else if (gol == 2){
            biaya = 5000;
            }
            else if (gol == 3){
            biaya = 5000;
            }
        }
        else if (NamaDaerah[masuk-1] == "Porong" && NamaDaerah[keluar-1] == "Gempol"){
            if (gol == 1){
            biaya = 6000 + 3000;
            }
            else if (gol == 2){
            biaya = 11500;
            }
            else if (gol == 3){
            biaya = 11500;
            }
        }
        
        
        System.out.println("===================");
        System.out.println("Total biaya yang harus dibayarkan: "+biaya);
    }
    
}
