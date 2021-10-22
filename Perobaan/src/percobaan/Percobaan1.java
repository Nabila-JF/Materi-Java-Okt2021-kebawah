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
public class Percobaan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int permen1;
        
        Scanner input=new Scanner (System.in);
        
        System.out.println("Masukkan jumlah permen: ");
        permen1=input.nextInt();
      
        
        if(permen1 == 2){
            System.out.println("Bisa dibagi sama rata");
        }else{
            System.out.println("Tidak bisa dibagi sama rata");
            
        }
    }
    
}
