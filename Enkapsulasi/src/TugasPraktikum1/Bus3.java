/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;

/**
 *
 * @author LENOVO
 */
public class Bus3 {
    private double penumpang, maxpenumpang;
    private double penumpangBaru;
    private double counter;
    
    public Bus3(double maxpenumpang){
    this.maxpenumpang = maxpenumpang;
    penumpang = 0;
    }
    //Method Mutator
    public void addpenumpang (double penumpang){
    int temp;
    temp = (int) (this.penumpang+penumpang);
    if (temp> maxpenumpang){
        System.out.println("penumpang melebihi kuota");
    }else{
    this.penumpang = temp;
    counter++;
    }
    }
    
    public void getpenumpang (double password){
    if (password == 24){
        System.out.println("Password Benar");
    }else{
        System.out.println("Password Salah");
    }
    }
    
    public double getAverage(){
    double average = penumpang / counter;
    return average;
    }
    
    public void cetakpenumpang(){
        System.out.println("penumpang bus sekarang = "+penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = "+maxpenumpang);
    }
}
