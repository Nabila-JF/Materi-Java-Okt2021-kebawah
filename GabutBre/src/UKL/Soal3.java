/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKL;

/**
 *
 * @author LENOVO
 */
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 12;
        int b = 4;
        int n = 16;
        int u = a;
        int s =a;
        System.out.println("Berikut merupakan deret aritmatika: ");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i ; j++) {
                System.out.print(u+"\t");
            u = u + b;
            s = s + u;
            }
            System.out.println();
            //System.out.println(u);
            //u = u + b;
            //s = s + u;
        }
        s = s - u;
        System.out.println("Jumlah seluruh deret aritmatika "+s);
    }
    
}
