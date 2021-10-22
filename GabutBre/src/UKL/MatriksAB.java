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
public class MatriksAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[][]={{3,2,5},{8,8,5}};
        int b[][]={{1,3},{6,9},{9,6}};
        int h[][]={{0,0},{0,0}};
        System.out.println("Hasil kali matriks A dan B adalah ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    h[i][j]=h[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(h[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
