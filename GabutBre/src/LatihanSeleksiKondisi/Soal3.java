/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LatihanSeleksiKondisi;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Soal3 {
    static int hitung(int asal,int tujuan,int gol) {
    int tarif=0;
     if (asal==1&&tujuan==2) {//dupak waru
         if (gol==1) {
           tarif=6000;  
         }
         else if (gol==2||gol==3) {
          tarif=8000;   
         }
     }
         else if (asal==2&&tujuan==3) {//waru sidoarjo
             if (gol==1) {
                tarif= 9000;
             }
             else if (gol==2||gol==3) {
                tarif=9000;  
             }
         }
         else if(asal==2&&tujuan==4) {//waru porong
         if (gol==1) {
           tarif=9000;  
         }
         else if (gol==2||gol==3) {
          tarif=14000;   
         }
         
  }
     else if(asal==3&&tujuan==2) {//sidoarjo waru
         if (gol==1) {
           tarif=6000;  
         }
         else if (gol==2||gol==3) {
          tarif=9000;   
         } 
 }
      else if(asal==3&&tujuan==4) {//sidoarjo porong
         if (gol==1) {
           tarif=5500;  
         }
         else if (gol==3||gol==4) {
          tarif=8500;   
         }
 }
     else if(asal==4&&tujuan==3) {//porong sidoarjo
         if (gol==1) {
           tarif=5500;  
         }
         else if (gol==3||gol==4) {
          tarif=8500;   
         }
 } 
      else if(asal==4&&tujuan==2) {//porong waru
         if (gol==1) {
           tarif=9000;  
         }
         else if (gol==3||gol==4) {
          tarif=14000;   
         }
 }
      else if(asal==4&&tujuan==5) {//porong kejapanan
         if (gol==1) {
           tarif=6000;  
         }
         else if (gol==3||gol==4) {
          tarif=8500;   
         }
 }
      else if(asal==5&&tujuan==6) {//kejapanan gempol
         if (gol==1) {
           tarif=3000;  
         }
         else if (gol==3||gol==4) {
          tarif=5000;   
         }
 }
      else if(asal==4&&tujuan==6) {//porong gempol
         if (gol==1) {
           tarif=9000;  
         }
         else if (gol==3||gol==4) {
          tarif=13500;   
         }
 }
      else{
          tarif=0;
          
      }
     return tarif;
 }
public static void main(String[] args) {{
    int kodedaerah[]={1,2,3,4,5,6};
    String namadaerah[]={"dupak","waru","sidoarjo","porong","kejapanan","gempol"};
            
     System.out.println("input kode daerah asal");
     Scanner asal=new Scanner(System.in);
     String as=asal.nextLine();
     int asalin=Integer.valueOf(as);
     
     System.out.println("inputkan kode daerah tujuan");
      Scanner tujuan=new Scanner(System.in);
      String tuj=tujuan.nextLine();
      int tujuanin=Integer.valueOf(tuj);
      
      System.out.println("input gol kendaraan");
      Scanner golongan=new Scanner(System.in);
      String gol=golongan.nextLine();
      int golonganin=Integer.valueOf(gol);
      
      
      System.out.println("daerah asal :"+ namadaerah[asalin-1]);
       System.out.println("daerah tujuan :"+ namadaerah[tujuanin-1]);
        System.out.println("gol kendaraan :"+ golonganin);
        int total=hitung(asalin,tujuanin,golonganin);
        System.out.println("totalbiaya :"+total);
        

}
}
}
