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
public class Percobaan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int permenA1, permenA2;
        
        Scanner input=new Scanner (System.in);
        
        System.out.print("Masukkan jumlah permen: ");
        permenA1 = input.nextInt();
        
        permenA2 = permenA1 % 2;
        
        if (permenA2 == 0){
            System.out.println("Dapat dibagi sama rata");
        }else{
            System.out.println("Tidak dapat dibagi sama rata");}
    }
    
}
