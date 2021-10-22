
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class RemidiPASS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama, kelas, absen, grade;
        double nilaiT, nilaiT1, nilaiT2, nilaiT3, nilaiPA, nilaiP, nilaiUA, nilaiU, nilaiA;
        
        // Memasukkan data
        System.out.println("Masukkan data diri dan nilai anda");
        Scanner input=new Scanner (System.in);
        
        System.out.print("\nNama: ");
        nama=input.nextLine();
        
        System.out.print("Kelas: ");
        kelas=input.nextLine();
        
        System.out.print("Absen: ");
        absen=input.nextLine();
        
        System.out.print("\nNilai Tugas 1: ");
        nilaiT1=input.nextDouble();
        
        System.out.print("Nilai Tugas 2: ");
        nilaiT2=input.nextDouble();
        
        System.out.print("Nilai Tugas 3: ");
        nilaiT3=input.nextDouble();
        
        System.out.print("Nilai Praktek: ");
        nilaiP=input.nextDouble();
        
        System.out.print("Nilai Ujian Akhir Semester: ");
        nilaiU=input.nextDouble();
        
        //Menghitung nilai
        nilaiT = ((nilaiT1*0.2)+(nilaiT2*0.2)+(nilaiT3*0.2))/3;
        
        nilaiPA = (nilaiP*0.3);
        
        nilaiUA = (nilaiU*0.5);
        
        nilaiA = nilaiT + nilaiPA + nilaiUA;
        
        //Hasil Output
        System.out.println("\n\n\nBerikut Merupakan Data Diri dan Nilai Anda");
        System.out.println("\nNama: "+nama);
        System.out.println("Kelas: "+kelas);
        System.out.println("Absen: "+absen);
        System.out.println("\nNilai Tugas 1: "+nilaiT1);
        System.out.println("Nilai Tugas 2: "+nilaiT2);
        System.out.println("Nilai Tugas 3: "+nilaiT3);
        System.out.println("Nilai Praktek: "+nilaiP);
        System.out.println("Nilai Ujian Akhir Semester: "+nilaiU);
        System.out.println("Nilai Akhir: "+nilaiA);
        
        //Membuat daftar remidi
        System.out.println("Berikut Merupakan Daftar Remidi Anda: ");
        if (nilaiT1 <= 75){ 
            System.out.println("- Tugas 1");
        }else{}
        if (nilaiT2 <= 75){
            System.out.println("- Tugas 2");
        }else{}
        if (nilaiT3 <= 75){
            System.out.println("- Tugas 3");
        }else{}
        if (nilaiP <= 75) {
            System.out.println("- Tugas Praktek");
        }else{}
        if (nilaiU <= 75) {
            System.out.println("- Ujian Akhir Semester\n");
        }else{}
        
        //Menentukan Grade
        if (nilaiA > 90){
            grade = "A";
        } else if (nilaiA > 80){
            grade = "B";
        } else if (nilaiA > 70){
            grade = "C";
        } else if (nilaiA > 60){
            grade = "D";
        } else {
            grade = "E";
        }
        
        System.out.println("Grade: "+grade);
        
    }
    
}
