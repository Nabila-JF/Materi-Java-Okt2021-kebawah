/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author LENOVO
 */
public class Employ extends Person {
    private String noKaryawan;

    public Employ(String nama, int usia, String noKaryawan) {
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }
    public void info(){
        System.out.println("No. Karyawan : "+ this.noKaryawan);
        super.info();
    }
}
