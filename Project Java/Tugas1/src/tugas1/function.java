/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author LENOVO
 */
public class function {

    /**
     * @param args the command line arguments
     */
    static int luasPersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    }
    public static void main(String[] args) {
        System.out.println("Luas persegi dengan panjang sisi 5 adalah " + luasPersegi(5));
    }
    
}
