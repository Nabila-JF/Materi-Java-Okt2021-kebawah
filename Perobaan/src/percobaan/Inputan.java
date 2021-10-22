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
public class Inputan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Masukkan nilai a: ");
        a = input.nextInt();
        System.out.print("Masukkan nilai b: ");
        b = input.nextInt();
        System.out.println();
        System.out.println("Nilai variabel yang ada di dalam program: ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    
}
