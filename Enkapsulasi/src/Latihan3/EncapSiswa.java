/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author LENOVO
 */
public class EncapSiswa {
    private String nama;
    private String alamat;
    private int absen;
    
    public int getAbsen(){
    return absen;
    }
    public String getNama(){
    return nama;
    }
    public String getAlamat(){
    return alamat;
    }
    public void setAbsen (int newAbsen){
    absen = newAbsen; 
    }
    public void setNama (String newNama){
    nama = newNama;
    }
    public void setAlamat (String newAlamat){
    alamat = newAlamat;
    }
}
