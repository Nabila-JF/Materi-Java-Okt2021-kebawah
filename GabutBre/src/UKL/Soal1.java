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
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 11;
        int b = 7;
        int n = 16;
        int u = a;
        int s =a;
        
        System.out.println("Berikut merupakan deret aritmatika: ");
        
        for (int i = 0; i < n; i++) {
            //System.out.println(u);
            u = u + b;
            if (i > 7){
                System.out.println(u);
            }
            s = s + u;
        }
        s = s - u;
        System.out.println("Jumlah seluruh deret aritmatika "+s);
    }
    
}
