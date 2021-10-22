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
public class perulanganarray {

    
    public static void main(String[] args) {
        String identitas = "Nabila Jauza Firjatullah / XRPL1 / 27 ";
        System.out.println("Identitas: "+identitas);
        System.out.println("\nKetentuan Protokol Kesehatan\n");
        
        boolean hijau = true;
       
        if (hijau == true){
             String[] perlengkapan;
        
        perlengkapan = new String[6];
        
        perlengkapan[0] = "1. Pakai masker";
        perlengkapan[1] = "2. Cek suhu tubuh";
        perlengkapan[2] = "3. Cuci tangan";
        perlengkapan[3] = "4. Siap handsanitizer";
        perlengkapan[4] = "5. Jaga jarak";
        perlengkapan[5] = "6. Jaga imun";
            System.out.println("Jika zona hijau masuk sekolah maka,\n");
        System.out.println(perlengkapan[0]);
        System.out.println(perlengkapan[1]);
        System.out.println(perlengkapan[2]);
        System.out.println(perlengkapan[3]);
        System.out.println(perlengkapan[4]);
        System.out.println(perlengkapan[5]);
        
        //Another Way
        for (int i = 0; i <= 5; i++) {
            System.out.println(perlengkapan[i]);
        }
        
        }else{
            System.out.println("Maaf, wilayah tersebut masih belum memenuhi protokol kesehatan.");
        }
            
    }
    
}
