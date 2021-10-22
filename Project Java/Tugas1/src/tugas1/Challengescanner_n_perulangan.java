/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Challengescanner_n_perulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Masukkan jenis zona wilayah: ");
        
        String zona = scanner.next(); 
       
        if (zona.equals("hijau")){
            String[] perlengkapan = {"1. Pakai masker", "2. Cek suhu tubuh", "3. Cuci tangan", "4. Siap handsanitizer", "5. Jaga jarak", "6. Jaga imun"};
       
        
            System.out.println("Jika zona hijau masuk sekolah maka,\n");
            for (int i = 0; i <= 5; i++) {
                System.out.println(perlengkapan[i]);
            }
            
        }else{
             System.out.println("Maaf, wilayah tersebut masih belum memenuhi protokol kesehatan.");
        }
        
    }
    
}
