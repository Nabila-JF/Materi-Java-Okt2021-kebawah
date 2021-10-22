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
public class Murid extends Orang {
    private String noNIS;

    public Murid(String nama, int usia, String noNIS) {
        super(nama, usia);
        this.noNIS = noNIS;
    }
    public void info(){
        System.out.println("No. NIS : "+ this.noNIS);
        super.info();
    }
}
