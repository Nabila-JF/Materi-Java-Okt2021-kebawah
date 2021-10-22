/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanSeleksiKondisi;

import java.util.Scanner;

/**
 *
 * @author Aizar
 */
public class Soal1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int id[] = {1, 2, 3, 4};
        String nama[] = {"Galuh", "Indro", "Jedi", "Kenu"};
        int golongan[] = {1, 3, 2, 3};
        String alamat[] = {"Sawojajar", "Kedungkandang", "Ijen", "Dinoyo"};
        int admin = 13000;
        int tarifGolongan = 0;
        int jumlahTagihan;

        System.out.println("Masukkan Id Pelanggan \t: ");
        int inputId = scan.nextInt();

        System.out.println("Masukkan Banyaknya Pemakaian \t: ");
        int pemakaian = scan.nextInt();

        switch (golongan[inputId - 1]) {
            case 1:
                tarifGolongan = 1000;
                break;
            case 2:
                tarifGolongan = 1300;
                break;
            case 3:
                tarifGolongan = 1500;
        }
        jumlahTagihan = (pemakaian * tarifGolongan) + admin;
        if (jumlahTagihan < 50000) {
            jumlahTagihan = 50000;
        }
        System.out.println("Id Pelanggan \t= " + inputId);
        System.out.println("Nama Pelanggan \t= " + nama[inputId - 1]);
        System.out.println("Alamat      \t= " + alamat[inputId - 1]);
        System.out.println("Tarif Golongan \t= " + tarifGolongan);
        System.out.println("Jumlah Tagihan \t= " + jumlahTagihan);

    }
}
