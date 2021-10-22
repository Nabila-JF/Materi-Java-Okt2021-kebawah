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
public class PilihanKondisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan pilih angka 1-3: ");
        int bil = input.nextInt();
        switch (bil) {
        case 1 : System.out.println("Satu");
        //break;
        case 2 : System.out.println("Dua");
        //break; 
        case 3 : System.out.println("Tiga");}
    }
    
}
