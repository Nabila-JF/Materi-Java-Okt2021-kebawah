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
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a [][]={{-3,2},{6,8}};
        int b [][]={{4,5},{-8,6}};
        System.out.println("Hasil Matriks A-B adalah: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j]-b[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}
