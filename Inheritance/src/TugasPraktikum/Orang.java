/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author LENOVO
 */
public class Orang {
    protected String nama;
    protected int usia;
    
    //Konstruktor
    public Orang (String nama, int usia){
    this.nama = nama;
    this.usia = usia;
    }
    //Metode
    public void info (){
        System.out.println("Nama: "+this.nama);
        System.out.println("Usia: "+this.usia);
}
}
